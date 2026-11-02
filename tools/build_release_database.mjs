// Create a validated release database without modifying the previous release.
// Requires Node.js with node:sqlite backup support (Node.js 22.16+ or 24+).
import assert from 'node:assert/strict';
import crypto from 'node:crypto';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { DatabaseSync, backup } from 'node:sqlite';

const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const [sourceArgument, outputArgument, reportArgument] = process.argv.slice(2);
if (!sourceArgument || !outputArgument || !reportArgument) {
  throw Error('Usage: node tools/build_release_database.mjs SOURCE.sqlite OUTPUT.sqlite REPORT.json');
}
const sourcePath = fs.realpathSync(sourceArgument);
const outputPath = path.resolve(outputArgument);
const reportPath = path.resolve(reportArgument);
assert.notEqual(sourcePath.toLowerCase(), outputPath.toLowerCase(), 'Source and output must differ.');
assert(!fs.existsSync(outputPath), 'Output already exists; refusing to overwrite it.');
assert(!fs.existsSync(reportPath), 'Report already exists; refusing to overwrite it.');

const emit = value => process.stdout.write(JSON.stringify(value) + '\n');
const readText = file => fs.readFileSync(file, 'utf8').replace(/\r\n?/g, '\n');
const sha256 = file => new Promise((resolve, reject) => {
  const digest = crypto.createHash('sha256');
  const stream = fs.createReadStream(file);
  stream.on('data', bytes => digest.update(bytes));
  stream.on('error', reject);
  stream.on('end', () => resolve(digest.digest('hex')));
});
const humanStatuses = {
  equivalent: 'human_equivalent',
  inequivalent: 'human_inequivalent',
  unverified: 'not_manually_inspected',
};
const repository = new Map();
for (const [pkg, humanStatus] of Object.entries(humanStatuses)) {
  const sourceDir = path.join(root, 'src/main/java', pkg);
  const testDir = path.join(root, 'src/test/java', pkg);
  const tests = new Set(fs.readdirSync(testDir));
  for (const name of fs.readdirSync(sourceDir)) {
    const match = /^ClonePair(\d+)\.java$/.exec(name);
    if (!match) continue;
    const id = Number(match[1]);
    assert(!repository.has(id), `Duplicate repository pair ID ${id}.`);
    const stem = `ClonePair${id}`;
    const found = tests.has(`${stem}DifferenceFindingTest.java`);
    const noWitness = tests.has(`${stem}NoDifferenceTest.java`);
    assert.notEqual(found, noWitness, `Pair ${id} must have exactly one test file.`);
    const testName = `${stem}${found ? 'DifferenceFindingTest' : 'NoDifferenceTest'}.java`;
    const testSource = readText(path.join(testDir, testName));
    let differenceType = null;
    if (found) {
      const types = [...new Set([...testSource.matchAll(
        /@BehavioralDifference\(\s*DifferenceType\.(\w+)\s*\)/g,
      )].map(m => m[1].toLowerCase()))];
      assert.equal(types.length, 1, `Pair ${id} must have one difference category.`);
      [differenceType] = types;
      assert(['return_value', 'exception', 'side_effect', 'no_termination'].includes(differenceType));
    }
    repository.set(id, {
      pair_id: id,
      human_status: humanStatus,
      llm_status: found ? 'witness_found' : 'no_witness_found',
      difference_type: differenceType,
      pair_src: readText(path.join(sourceDir, name)),
      test_src: testSource,
    });
  }
}
assert.equal(repository.size, 13710);

const latestResults = readText(path.join(root, 'logs/ollama-witness-20b/latest-results.jsonl'))
  .trim().split('\n').map(JSON.parse);
assert.equal(latestResults.length, 7502);
const additions = new Set(latestResults.filter(r => r.status === 'found').map(r => r.id));
assert.equal(additions.size, 175);
const source = new DatabaseSync(sourcePath, { readOnly: true });
let output;
try {
  const schema = database => database.prepare(
    'SELECT type,name,tbl_name,sql FROM sqlite_master ORDER BY type,name',
  ).all();
  const tableCounts = database => Object.fromEntries(
    ['methods', 'pairs', 'verifiedpairs', 'llm_inspected_pairs'].map(name =>
      [name, database.prepare(`SELECT COUNT(*) AS count FROM ${name}`).get().count]),
  );
  const sourceSchema = schema(source);
  assert(!sourceSchema.some(r => r.type === 'trigger'), 'Review source triggers before updating.');
  const originalCounts = tableCounts(source);
  const baseline = source.prepare('SELECT * FROM llm_inspected_pairs ORDER BY pair_id').all();
  assert.equal(baseline.length, repository.size);
  const updates = [];
  for (const row of baseline) {
    const expected = repository.get(row.pair_id);
    assert(expected, `Unexpected database pair ID ${row.pair_id}.`);
    assert.equal(row.human_status, expected.human_status);
    assert.equal(row.pair_src.replace(/\r\n?/g, '\n'), expected.pair_src,
      `Implementation changed for pair ${row.pair_id}.`);
    if (additions.has(row.pair_id)) {
      assert.equal(row.llm_status, 'no_witness_found');
      assert.equal(row.difference_type, null);
      assert.equal(expected.llm_status, 'witness_found');
      updates.push(expected);
    } else {
      assert.equal(row.llm_status, expected.llm_status);
      assert.equal(row.difference_type, expected.difference_type);
      assert.equal(row.test_src, expected.test_src, `Unexpected test change for ${row.pair_id}.`);
    }
  }
  assert.equal(updates.length, 175);
  emit({ event: 'preflight_passed', pairs: repository.size, updates: updates.length, originalCounts });
  const sourceHash = await sha256(sourcePath);

  fs.mkdirSync(path.dirname(outputPath), { recursive: true });
  fs.closeSync(fs.openSync(outputPath, 'wx'));
  let lastProgress = -1;
  await backup(source, outputPath, {
    rate: 10000,
    progress: ({ totalPages, remainingPages }) => {
      const progress = Math.floor(10 * (totalPages - remainingPages) / totalPages);
      if (progress !== lastProgress) {
        lastProgress = progress;
        emit({ event: 'backup_progress', percent: progress * 10 });
      }
    },
  });
  output = new DatabaseSync(outputPath);
  output.exec('PRAGMA foreign_keys=ON; BEGIN IMMEDIATE');
  try {
    const update = output.prepare(
      "UPDATE llm_inspected_pairs SET llm_status=?,difference_type=?,test_src=? " +
      "WHERE pair_id=? AND human_status=? AND llm_status='no_witness_found' AND difference_type IS NULL",
    );
    for (const row of updates) {
      assert.equal(update.run(row.llm_status, row.difference_type, row.test_src,
        row.pair_id, row.human_status).changes, 1);
    }
    output.exec('COMMIT');
  } catch (error) {
    output.exec('ROLLBACK');
    throw error;
  }
  emit({ event: 'updated', rows: updates.length });
  assert.deepEqual(schema(output), sourceSchema, 'Database schema changed.');
  assert.deepEqual(tableCounts(output), originalCounts, 'Existing table row counts changed.');
  const rows = output.prepare('SELECT * FROM llm_inspected_pairs ORDER BY pair_id').all();
  for (const actual of rows) {
    const expected = repository.get(actual.pair_id);
    for (const field of ['human_status', 'llm_status', 'difference_type', 'test_src']) {
      assert.equal(actual[field], expected[field], `Mismatch in ${field} for pair ${actual.pair_id}.`);
    }
    assert.equal(actual.pair_src.replace(/\r\n?/g, '\n'), expected.pair_src);
  }
  emit({ event: 'all_repository_rows_matched', rows: rows.length });
  assert.deepEqual(output.prepare('PRAGMA foreign_key_check').all(), []);
  emit({ event: 'integrity_check_started' });
  const integrity = output.prepare('PRAGMA integrity_check').all().map(row => row.integrity_check);
  assert.deepEqual(integrity, ['ok']);
  const distribution = output.prepare(
    'SELECT human_status,llm_status,difference_type,COUNT(*) AS count ' +
    'FROM llm_inspected_pairs GROUP BY human_status,llm_status,difference_type ' +
    'ORDER BY human_status,llm_status,difference_type',
  ).all();
  const counts = Object.fromEntries(output.prepare(
    'SELECT llm_status,COUNT(*) AS count FROM llm_inspected_pairs GROUP BY llm_status',
  ).all().map(row => [row.llm_status, row.count]));
  const differenceCounts = Object.fromEntries(output.prepare(
    "SELECT difference_type,COUNT(*) AS count FROM llm_inspected_pairs WHERE llm_status='witness_found' " +
    'GROUP BY difference_type',
  ).all().map(row => [row.difference_type, row.count]));
  assert.deepEqual(counts, { no_witness_found: 7327, witness_found: 6383 });
  assert.deepEqual(differenceCounts, {
    exception: 1451, no_termination: 679, return_value: 3875, side_effect: 378,
  });
  output.close();
  output = undefined;
  source.close();
  const outputHash = await sha256(outputPath);
  assert.equal(await sha256(sourcePath), sourceHash, 'Original database changed during the build.');
  fs.writeFileSync(outputPath + '.sha256', `${outputHash}  ${path.basename(outputPath)}\n`, { flag: 'wx' });
  const report = {
    createdAt: new Date().toISOString(),
    source: sourcePath,
    sourceSha256: sourceHash,
    sourceUnchanged: true,
    output: outputPath,
    outputSha256: outputHash,
    outputBytes: fs.statSync(outputPath).size,
    updatedPairs: updates.map(row => row.pair_id),
    updatedPairCount: updates.length,
    repositoryRowsMatched: rows.length,
    schemaUnchanged: true,
    originalTableCounts: originalCounts,
    counts,
    differenceCounts,
    distribution,
    integrityCheck: integrity,
    foreignKeyViolations: 0,
    sourceTextLineEndings: 'LF',
  };
  fs.mkdirSync(path.dirname(reportPath), { recursive: true });
  fs.writeFileSync(reportPath, JSON.stringify(report, null, 2) + '\n', { flag: 'wx' });
  emit({ event: 'release_database_validated', ...report, updatedPairs: undefined, distribution: undefined });
} finally {
  if (output?.isOpen) output.close();
  if (source.isOpen) source.close();
}
