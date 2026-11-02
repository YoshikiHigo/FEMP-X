// Resumable, sequential Ollama witness generation. Codex reviews every candidate
// before probe execution and installs tests only after independent verification.
import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import { fileURLToPath } from 'node:url';
import { spawn } from 'node:child_process';

const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const runId = process.env.OLLAMA_WITNESS_RUN;
if (runId && !/^[A-Za-z0-9_-]+$/.test(runId)) throw Error('Invalid OLLAMA_WITNESS_RUN.');
const runParts = runId ? ['reruns', runId] : [];
const logDir = path.join(root, 'logs', 'ollama-witness-20b', ...runParts);
const workDir = path.join(root, 'build', 'ollama-witness-20b', ...runParts);
const manifestPath = path.join(logDir, 'manifest.json');
const currentPath = path.join(logDir, 'current.json');
const prefetchPath = path.join(logDir, 'prefetch.json');
const resultPath = path.join(logDir, 'results.jsonl');
const fields = ['status', 'valueSnapshot', 'exceptionClass', 'stdout', 'stderr',
  'originalInputsSnapshot', 'inputAfterSnapshot'];
const model = 'gpt-oss:20b';
const noDeadline = process.env.OLLAMA_WITNESS_NO_DEADLINE === '1';
if (noDeadline && !runId) throw Error('Unlimited execution requires an isolated rerun.');
const budgetMs = noDeadline ? null : 180000;
fs.mkdirSync(logDir, { recursive: true });
fs.mkdirSync(workDir, { recursive: true });
const readJson = p => JSON.parse(fs.readFileSync(p, 'utf8'));
const writeJson = (p, v) => fs.writeFileSync(p, JSON.stringify(v, null, 2) + '\n');
const hash = p => crypto.createHash('sha256').update(fs.readFileSync(p)).digest('hex');
const remaining = s => s.deadline === null ? Infinity : Math.max(0, s.deadline - Date.now());
const rel = p => path.relative(root, p).replaceAll('\\', '/');
const absolute = p => path.resolve(root, p);
const emit = v => process.stdout.write(JSON.stringify(v) + '\n');
const javaString = value => value == null ? 'null' : JSON.stringify(value)
  .replace(/[^\x20-\x7e]/g, c => '\\u' + c.charCodeAt(0).toString(16).padStart(4, '0'));

function manifest() {
  if (fs.existsSync(manifestPath)) return readJson(manifestPath);
  if (runId) throw Error('A rerun requires an explicitly prepared manifest.');
  const targets = [];
  for (const pkg of fs.readdirSync(path.join(root, 'src/test/java')).sort()) {
    const dir = path.join(root, 'src/test/java', pkg);
    if (!fs.statSync(dir).isDirectory()) continue;
    for (const name of fs.readdirSync(dir)) {
      const match = /^ClonePair(\d+)NoDifferenceTest\.java$/.exec(name);
      if (!match) continue;
      const source = path.join(root, 'src/main/java', pkg, `ClonePair${match[1]}.java`);
      const test = path.join(dir, name);
      targets.push({ package: pkg, id: Number(match[1]), key: `${pkg}.ClonePair${match[1]}`,
        source: rel(source), test: rel(test), sourceHash: hash(source), testHash: hash(test) });
    }
  }
  targets.sort((a, b) => a.package.localeCompare(b.package) || a.id - b.id);
  const data = { createdAt: new Date().toISOString(), model, budgetMs, targets };
  writeJson(manifestPath, data);
  return data;
}

function results() {
  if (!fs.existsSync(resultPath)) return [];
  return fs.readFileSync(resultPath, 'utf8').trim().split('\n').filter(Boolean).map(JSON.parse);
}

function finish(s, status, reason, sessionPath = currentPath) {
  const record = { key: s.key, package: s.package, id: s.id, model,
    status, reason, startedAt: s.startedAt, finishedAt: new Date().toISOString(),
    elapsedSeconds: Math.round((Date.now() - Date.parse(s.startedAt)) / 10) / 100,
    attempts: s.attempt, candidatePath: s.candidatePath || null,
    probePath: s.probePath || null, testPath: s.savedTestPath || null,
    prefetchAnchorKey: s.anchorKey || null, reviewStartedAt: s.reviewStartedAt || null,
    firstGenerationReadyAt: s.firstGenerationReadyAt || null,
    deadlineAt: s.deadline === null ? null : new Date(s.deadline).toISOString() };
  fs.appendFileSync(resultPath, JSON.stringify(record) + '\n');
  if (sessionPath === prefetchPath) {
    // Keep a marker until the current pair finishes: at most one target ahead.
    s.phase = 'prefetch_completed';
    s.completedResult = record;
    writeJson(prefetchPath, s);
  } else {
    fs.unlinkSync(currentPath);
  }
  emit({ event: 'completed', ...record,
    ...(sessionPath === prefetchPath ? { prefetched: true, completed: results().length } : {}) });
}

function current() {
  if (!fs.existsSync(currentPath)) throw Error('No active pair. Run next.');
  return readJson(currentPath);
}

function validateCandidate(c) {
  if (typeof c.found !== 'boolean' || typeof c.reason !== 'string') {
    throw Error('Response requires boolean found and string reason.');
  }
  if (!c.found) return;
  if (!['return_value', 'side_effect', 'exception', 'no_termination'].includes(c.difference_type)) {
    throw Error('Invalid difference_type.');
  }
  if (!Array.isArray(c.arguments_java) || !Array.isArray(c.parameter_types)
      || c.arguments_java.length !== c.parameter_types.length
      || !c.arguments_java.every(v => typeof v === 'string')
      || !c.parameter_types.every(v => typeof v === 'string' && /^[\w.$<>?, \[\]]+$/.test(v))
      || typeof c.void_return !== 'boolean') {
    throw Error('Candidate requires arguments_java, parameter_types and void_return.');
  }
}

async function requestCandidate(s, feedback, sessionPath = currentPath) {
  if (remaining(s) < 35000) return finish(s, 'time_limit', 'Insufficient time remains for generation and verification.', sessionPath);
  if (hash(absolute(s.source)) !== s.sourceHash || hash(absolute(s.test)) !== s.testHash) {
    return finish(s, 'environment_error', 'Source or existing test changed since manifest creation.', sessionPath);
  }
  const source = fs.readFileSync(absolute(s.source), 'utf8');
  const test = fs.readFileSync(absolute(s.test), 'utf8');
  s.attempt += 1;
  const system = `Find a concrete Java test case distinguishing method1 and method2 in a clone-pair class.
The allowed differences are return_value, side_effect (argument mutation, stdout or stderr),
exception (normal completion versus exception or different exception classes), and no_termination.
Both methods must receive the SAME input and SAME initial state. Do not use timing differences,
exception messages alone, identity hash codes, randomness, concurrency tricks, method-name-dependent
objects, modified implementations, or test assertions that merely assert your own prediction.
Package names and existing NoDifference tests are not proof of equivalence.
Return JSON ONLY. For a concrete candidate return:
{"found":true,"difference_type":"return_value","reason":"explain both predicted behaviors",
"arguments_java":["Java expression for argument 0"],"parameter_types":["String"],
"void_return":false,"nontermination_evidence":"specific loop/recursion reasoning if relevant"}.
The parameter_types must match the source declarations, with varargs represented as arrays.
arguments_java are expressions in a Java source importing java.util.*, java.math.*, java.nio.charset.*,
and static ${s.package}.ClonePairGenericInvocationTestSupport.*. Use ASCII Java source with Unicode
escapes when necessary. Available helpers include list(...), vector(...), map(...), hashMap(...),
props(...), stringSet(...), linkedSet(...), builder(...), sb(...), atomicInt(...), textObject(...),
throwingToStringObject(), enumeration(...), date(...), calendar(...), locale(...), bitset(...).
Use only deterministic, local, bounded inputs. Do not touch files/network/processes, system properties,
environment, reflection, class loading, stdout/stderr, or the clock in input expressions.
Use literal arrays instead of allocating huge arrays. Input creation must terminate normally.
For no_termination, explain why a loop or recursion cannot finish; slow finite computation is not enough.
If you cannot identify a concrete separating input, return {"found":false,"reason":"brief explanation"}.
Do not invent a separating input for actually equivalent methods. Your candidate will be compiled and
executed independently; rejected candidates must be revised using the supplied actual execution feedback.`;
  let prompt = `SOURCE:\n${source}\nEXISTING TEST:\n${test}`;
  if (feedback) {
    const previous = s.candidatePath ? readJson(absolute(s.candidatePath)) : null;
    prompt += `\nPREVIOUS CANDIDATE:\n${JSON.stringify(previous)}\nVERIFIER FEEDBACK:\n${feedback}\nGenerate a different concrete test case, or explain that no separating case was found.`;
  }
  const request = { model, system, prompt, stream: false, think: 'low', format: 'json',
    keep_alive: '24h', options: { temperature: 0.2, seed: s.id + s.attempt, num_predict: 4096, num_ctx: 16384 } };
  const artifactDir = path.join(logDir, s.key);
  fs.mkdirSync(artifactDir, { recursive: true });
  writeJson(path.join(artifactDir, `attempt-${s.attempt}-request.json`), request);
  s.phase = 'generating';
  writeJson(sessionPath, s);
  try {
    const response = await fetch('http://127.0.0.1:11434/api/generate', {
      method: 'POST', headers: { 'Content-Type': 'application/json' }, body: JSON.stringify(request),
      ...(s.deadline === null ? {} : { signal: AbortSignal.timeout(Math.min(90000, remaining(s) - 30000)) }) });
    if (!response.ok) throw Error(`Ollama HTTP ${response.status}: ${await response.text()}`);
    const raw = await response.json();
    s.firstGenerationReadyAt ||= new Date().toISOString();
    // Store only the generated answer and timing, not hidden reasoning.
    writeJson(path.join(artifactDir, `attempt-${s.attempt}-response.json`), {
      model: raw.model, response: raw.response, done: raw.done, done_reason: raw.done_reason,
      prompt_eval_count: raw.prompt_eval_count, eval_count: raw.eval_count,
      total_duration: raw.total_duration, load_duration: raw.load_duration });
    let candidate;
    try {
      candidate = JSON.parse(raw.response);
      validateCandidate(candidate);
    } catch (error) {
      s.phase = 'needs_retry';
      s.lastError = String(error);
      writeJson(sessionPath, s);
      emit({ event: 'retry_needed', key: s.key, remainingSeconds: remaining(s) / 1000,
        reason: String(error), response: raw.response });
      return;
    }
    const candidatePath = path.join(artifactDir, `attempt-${s.attempt}-candidate.json`);
    writeJson(candidatePath, candidate);
    s.candidatePath = rel(candidatePath);
    s.phase = candidate.found ? 'awaiting_candidate_review' : 'completed';
    if (candidate.found && sessionPath === currentPath) s.reviewStartedAt ||= new Date().toISOString();
    writeJson(sessionPath, s);
    if (!candidate.found) return finish(s, 'not_found', candidate.reason, sessionPath);
    emit({ event: 'candidate_review_required', key: s.key, attempt: s.attempt,
      remainingSeconds: remaining(s) / 1000, candidatePath: s.candidatePath, candidate });
  } catch (error) {
    const timedOut = error.name === 'TimeoutError' || error.name === 'AbortError';
    if (timedOut && remaining(s) >= 35000) {
      s.phase = 'needs_retry';
      s.lastError = 'Generation request exceeded its allotted time.';
      writeJson(sessionPath, s);
      emit({ event: 'retry_needed', key: s.key, remainingSeconds: remaining(s) / 1000, reason: s.lastError });
    } else finish(s, timedOut ? 'time_limit' : 'environment_error', String(error), sessionPath);
  }
}

function execute(file, args, timeout, cwd = root) {
  return new Promise((resolve, reject) => {
    const child = spawn(file, args, { cwd, windowsHide: true, shell: false });
    let out = '', err = '', settled = false;
    const timer = setTimeout(() => { child.kill(); }, timeout);
    child.stdout.on('data', b => { out += b; if (out.length > 2000000) child.kill(); });
    child.stderr.on('data', b => { err += b; if (err.length > 2000000) child.kill(); });
    child.on('error', error => { clearTimeout(timer); settled = true; reject(error); });
    child.on('close', (code, signal) => {
      clearTimeout(timer);
      if (!settled) resolve({ code, signal, stdout: out, stderr: err });
    });
  });
}

function invocation(c, method) {
  const args = c.parameter_types.map((t, i) => `(${t}) values[${i}]`).join(', ');
  const call = `new ClonePair${current().id}().${method}(${args})`;
  return c.void_return ? `values -> { ${call}; return null; }` : `values -> ${call}`;
}

function classify(a, b) {
  if (a.originalInputsSnapshot !== b.originalInputsSnapshot) throw Error('Initial input snapshots differ.');
  if ((a.status === 'TIMEOUT') !== (b.status === 'TIMEOUT')) return 'no_termination';
  if (a.status === 'TIMEOUT' || b.status === 'TIMEOUT') return null;
  if (a.status !== b.status || a.exceptionClass !== b.exceptionClass) return 'exception';
  if (a.status === 'OK' && b.status === 'OK' && a.valueSnapshot !== b.valueSnapshot) return 'return_value';
  if (a.stdout !== b.stdout || a.stderr !== b.stderr || a.inputAfterSnapshot !== b.inputAfterSnapshot) return 'side_effect';
  return null;
}

function proposedTest(s, c, outcomes, kind) {
  const timeout = kind === 'no_termination';
  const captureName = 'ClonePairAliasAwareInvocationTestSupport.' + (timeout ? 'captureWithTimeout' : 'capture');
  const input = `new Object[]{${c.arguments_java.join(', ')}}`;
  const calls = [1, 2].map(n => `        ClonePairAliasAwareInvocationTestSupport.InvocationOutcome method${n}Outcome = ${captureName}(${invocation(c, `method${n}`)}${timeout ? ', 1000L' : ''}, ${input});`);
  const assertions = outcomes.map((outcome, i) => {
    const name = `method${i + 1}Outcome`;
    return `        ClonePairAliasAwareInvocationTestSupport.assertCoreOutcome(${name}, ${javaString(outcome.status)}, ${javaString(outcome.valueSnapshot)}, ${javaString(outcome.exceptionClass)},\n            ${javaString(outcome.originalInputsSnapshot)}, ${javaString(outcome.inputAfterSnapshot)});\n        ClonePairAliasAwareInvocationTestSupport.assertTextEquals("stdout", ${javaString(outcome.stdout)}, ${name}.stdout);\n        ClonePairAliasAwareInvocationTestSupport.assertTextEquals("stderr", ${javaString(outcome.stderr)}, ${name}.stderr);`;
  });
  return `package ${s.package};\n\nimport java.util.*;\nimport java.math.*;\nimport java.nio.charset.*;\n\nimport metadata.BehavioralDifference;\nimport metadata.DifferenceType;\n${timeout ? '\nimport org.junit.jupiter.api.Tag;' : ''}\nimport org.junit.jupiter.api.Test;\n\nimport static ${s.package}.ClonePairGenericInvocationTestSupport.*;\n\n/**\n * Generated by Codex (GPT-6.1).\n * Candidate input proposed by Ollama gpt-oss:20b; independently verified by Codex.\n */\n${timeout ? '@Tag("timeout")\n' : ''}class ClonePair${s.id}DifferenceFindingTest {\n\n    /**\n     * Difference type: ${kind}.\n     * Difference manifestation: ${kind === 'return_value' ? 'the methods return different values.' : kind === 'side_effect' ? 'the methods differ in observable side effects.' : kind === 'exception' ? 'the methods differ in thrown exceptions or normal completion.' : 'the methods differ in whether they terminate.'}\n     */\n    @Test\n    @BehavioralDifference(DifferenceType.${kind.toUpperCase()})\n    void methodsDisagreeOnOllamaGeneratedInput() {\n${calls.join('\n')}\n\n${assertions.join('\n')}\n    }\n}\n`;
}

async function probe(s) {
  if (remaining(s) < 25000) return finish(s, 'time_limit', 'No time remains for independent candidate verification.');
  const c = readJson(absolute(s.candidatePath));
  validateCandidate(c);
  if (!c.found) throw Error('Candidate has no test input.');
  s.probeRun = (s.probeRun || 0) + 1;
  writeJson(currentPath, s);
  const probeName = `attempt-${s.attempt}-probe-${s.probeRun}`;
  const dir = path.join(workDir, s.key, probeName);
  fs.mkdirSync(dir, { recursive: true });
  const probePath = path.join(dir, 'OllamaWitnessProbe.java');
  const source = `package ${s.package};\nimport java.util.*;\nimport java.math.*;\nimport java.nio.charset.*;\nimport static ${s.package}.ClonePairGenericInvocationTestSupport.*;\npublic class OllamaWitnessProbe {\n public static void main(String[] args) {\n  Object[] inputs = new Object[]{${c.arguments_java.join(', ')}};\n  ClonePairAliasAwareInvocationTestSupport.Invocation invocation = args[0].equals("1") ? ${invocation(c, 'method1')} : ${invocation(c, 'method2')};\n  ClonePairAliasAwareInvocationTestSupport.InvocationOutcome o = ClonePairAliasAwareInvocationTestSupport.captureWithTimeout(invocation, 1000L, inputs);\n  String[] fields = new String[]{${fields.map(f => 'o.' + f).join(', ')}};\n  System.out.print("WITNESS");\n  for (String f : fields) System.out.print("\\t" + (f == null ? "~" : Base64.getEncoder().encodeToString(f.getBytes(StandardCharsets.UTF_8))));\n  System.out.println();\n  System.exit(0);\n }\n}\n`;
  fs.writeFileSync(probePath, source);
  const classpath = [path.join(root, 'build/classes/java/main'), path.join(root, 'build/classes/java/test')].join(path.delimiter);
  const compile = await execute('javac', ['-encoding', 'UTF-8', '-cp', classpath, '-d', dir,
    absolute(s.source), path.join(root, 'src/test/java', s.package, 'ClonePairGenericInvocationTestSupport.java'),
    path.join(root, 'src/test/java', s.package, 'ClonePairAliasAwareInvocationTestSupport.java'),
    probePath], Math.min(15000, remaining(s)));
  writeJson(path.join(dir, 'compile.json'), compile);
  if (compile.code !== 0) {
    s.phase = 'needs_retry'; s.lastError = compile.stderr;
    writeJson(currentPath, s);
    return emit({ event: 'verification_failed', key: s.key, reason: 'Probe did not compile.', details: compile, remainingSeconds: remaining(s) / 1000 });
  }
  const allOutcomes = [];
  const rawRuns = [];
  for (let repeat = 0; repeat < 2; repeat++) {
    const outcomes = [];
    for (const n of [1, 2]) {
      const run = await execute('java', ['-Xmx256m', '-XX:ActiveProcessorCount=2', '-cp', dir + path.delimiter + classpath,
        `${s.package}.OllamaWitnessProbe`, String(n)], Math.min(10000, Math.max(1, remaining(s))));
      rawRuns.push(run);
      const match = /^WITNESS\t(.*)$/m.exec(run.stdout);
      if (run.code !== 0 || !match) {
        writeJson(path.join(dir, 'runs.json'), rawRuns);
        s.phase = 'needs_retry'; s.lastError = JSON.stringify(run);
        writeJson(currentPath, s);
        return emit({ event: 'verification_failed', key: s.key, reason: 'Probe JVM failed.', details: run, remainingSeconds: remaining(s) / 1000 });
      }
      const values = match[1].trimEnd().split('\t').map(v => v === '~' ? null : Buffer.from(v, 'base64').toString('utf8'));
      if (values.length !== fields.length) throw Error('Invalid probe field count.');
      outcomes.push(Object.fromEntries(fields.map((field, i) => [field, values[i]])));
    }
    allOutcomes.push(outcomes);
  }
  writeJson(path.join(dir, 'runs.json'), rawRuns);
  const stable = JSON.stringify(allOutcomes[0]) === JSON.stringify(allOutcomes[1]);
  const kind = stable ? classify(...allOutcomes[0]) : null;
  const report = { key: s.key, stable, differenceType: kind, outcomes: allOutcomes,
    modelCandidate: c, remainingSeconds: remaining(s) / 1000 };
  const reportPath = path.join(logDir, s.key, `${probeName}-verification.json`);
  writeJson(reportPath, report);
  s.probePath = rel(reportPath);
  s.phase = kind ? 'awaiting_semantic_review' : 'needs_retry';
  s.lastError = kind ? null : stable ? 'Both methods have identical observable outcomes.' : 'Outcomes were not reproducible across isolated JVMs.';
  if (kind) {
    const proposedPath = path.join(dir, `ClonePair${s.id}DifferenceFindingTest.java`);
    fs.writeFileSync(proposedPath, proposedTest(s, c, allOutcomes[0], kind));
    s.proposedTestPath = rel(proposedPath);
  }
  writeJson(currentPath, s);
  emit({ event: kind ? 'semantic_review_required' : 'verification_failed', ...report,
    proposedTestPath: s.proposedTestPath, reason: s.lastError });
}

async function main() {
  const command = process.argv[2] || 'status';
  const data = manifest();
  if (command === 'status') {
    const done = results();
    const counts = {};
    for (const r of done) counts[r.status] = (counts[r.status] || 0) + 1;
    emit({ total: data.targets.length, completed: done.length, counts,
      current: fs.existsSync(currentPath) ? current() : null,
      prefetch: fs.existsSync(prefetchPath) ? readJson(prefetchPath) : null });
  } else if (command === 'next') {
    if (fs.existsSync(currentPath)) {
      const s = current();
      if (!remaining(s)) return finish(s, 'time_limit', 'Pair processing deadline reached.');
      return emit({ event: 'pending_pair', current: s, remainingSeconds: remaining(s) / 1000 });
    }
    if (fs.existsSync(prefetchPath)) {
      const s = readJson(prefetchPath);
      if (s.phase === 'generating' || s.phase === 'starting') {
        return emit({ event: 'prefetch_in_progress', key: s.key, remainingSeconds: remaining(s) / 1000 });
      }
      if (s.phase === 'prefetch_completed') {
        // Its found:false (or actual failure) was already logged immediately.
        fs.unlinkSync(prefetchPath);
      } else {
        s.reviewStartedAt = new Date().toISOString();
        writeJson(currentPath, s);
        fs.unlinkSync(prefetchPath);
        if (!remaining(s)) return finish(s, 'time_limit', 'Pair processing deadline reached, including prefetch waiting time.');
        if (s.phase === 'awaiting_candidate_review') {
          return emit({ event: 'candidate_review_required', key: s.key, attempt: s.attempt,
            remainingSeconds: remaining(s) / 1000, candidatePath: s.candidatePath,
            candidate: readJson(absolute(s.candidatePath)), prefetched: true });
        }
        return emit({ event: 'retry_needed', key: s.key,
          remainingSeconds: remaining(s) / 1000, reason: s.lastError, prefetched: true });
      }
    }
    const done = new Set(results().map(r => r.key));
    const target = data.targets.find(t => !done.has(t.key));
    if (!target) return emit({ event: 'all_completed', total: data.targets.length });
    const s = { ...target, startedAt: new Date().toISOString(), deadline: budgetMs === null ? null : Date.now() + budgetMs,
      attempt: 0, phase: 'starting' };
    writeJson(currentPath, s);
    await requestCandidate(s);
  } else if (command === 'prefetch' || command === 'prefetch-advance') {
    if (!fs.existsSync(currentPath)) return emit({ event: 'no_current_pair' });
    if (fs.existsSync(prefetchPath)) {
      const ahead = readJson(prefetchPath);
      if (command === 'prefetch-advance' && ahead.phase === 'prefetch_completed'
          && ahead.completedResult?.status === 'not_found') {
        // User-authorized trial: completed negatives do not occupy the single
        // pending-review slot. Never advance past a candidate or actual failure.
        fs.unlinkSync(prefetchPath);
      } else {
        return emit({ event: 'pending_prefetch', prefetch: ahead });
      }
    }
    const active = current();
    if (!remaining(active) || !['awaiting_candidate_review', 'awaiting_semantic_review', 'needs_retry'].includes(active.phase)) {
      return emit({ event: 'prefetch_deferred', key: active.key, reason: 'Current pair is not awaiting review.' });
    }
    const done = new Set(results().map(r => r.key));
    const target = data.targets.find(t => !done.has(t.key) && t.key !== active.key);
    if (!target) return emit({ event: 'no_prefetch_target' });
    const s = { ...target, anchorKey: active.key, startedAt: new Date().toISOString(),
      deadline: budgetMs === null ? null : Date.now() + budgetMs, attempt: 0, phase: 'starting' };
    // Exclusive reservation prevents competing prefetch callers advancing twice.
    let reservation;
    try { reservation = fs.openSync(prefetchPath, 'wx'); }
    catch (error) {
      if (error.code === 'EEXIST') return emit({ event: 'prefetch_reserved' });
      throw error;
    }
    try { fs.writeFileSync(reservation, JSON.stringify(s, null, 2) + '\n'); }
    finally { fs.closeSync(reservation); }
    await requestCandidate(s, undefined, prefetchPath);
  } else if (command === 'retry') {
    if (fs.existsSync(prefetchPath) && ['generating', 'starting'].includes(readJson(prefetchPath).phase)) {
      return emit({ event: 'prefetch_in_progress', key: readJson(prefetchPath).key });
    }
    const s = current();
    await requestCandidate(s, process.argv.slice(3).join(' ') || s.lastError || 'Previous candidate was rejected.');
  } else if (command === 'probe') {
    await probe(current());
  } else if (command === 'finish') {
    const s = current();
    const status = process.argv[3];
    if (!['found', 'not_found', 'time_limit', 'environment_error'].includes(status)) throw Error('Invalid finish status.');
    if (status === 'found') {
      if (!remaining(s)) throw Error('Deadline exceeded; do not install this candidate.');
      const saved = path.join(root, 'src/test/java', s.package, `ClonePair${s.id}DifferenceFindingTest.java`);
      if (!fs.existsSync(saved) || fs.existsSync(absolute(s.test))) throw Error('Verified replacement is not installed.');
      if (!s.proposedTestPath || hash(saved) !== hash(absolute(s.proposedTestPath))) throw Error('Saved test differs from the independently probed proposal.');
      if (hash(absolute(s.source)) !== s.sourceHash) throw Error('Implementation was modified.');
      s.savedTestPath = rel(saved);
    }
    finish(s, status, process.argv.slice(4).join(' ') || status);
  } else throw Error(`Unknown command: ${command}`);
}

main().catch(error => { console.error(error.stack || String(error)); process.exitCode = 1; });
