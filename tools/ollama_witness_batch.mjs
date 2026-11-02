// Keep sequential discovery busy between completed found:false responses.
// Every candidate, malformed response, deadline, or environment error stops the
// batch for Codex review. This wrapper never probes, retries, or installs tests.
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { spawn } from 'node:child_process';

const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const driver = path.join(root, 'tools', 'ollama_witness_session.mjs');
const limit = Number(process.argv[2] ?? 30);
const prefetchMode = process.argv[3] === '--prefetch';
if (!Number.isInteger(limit) || limit < 1 || limit > 30) {
  throw Error('Usage: node tools/ollama_witness_batch.mjs [1..30] [--prefetch]');
}
const runId = process.env.OLLAMA_WITNESS_RUN;
if (runId && !/^[A-Za-z0-9_-]+$/.test(runId)) throw Error('Invalid OLLAMA_WITNESS_RUN.');
const logDir = path.join(root, 'logs', 'ollama-witness-20b', ...(runId ? ['reruns', runId] : []));
const lockPath = path.join(logDir, 'batch.lock');
const emit = value => process.stdout.write(JSON.stringify(value) + '\n');
let child = null;
let stopped = false;
let paused = false;
let lock;

function run(command) {
  return new Promise((resolve, reject) => {
    child = spawn(process.execPath, [driver, command], {
      cwd: root, windowsHide: true, shell: false,
      stdio: ['ignore', 'pipe', 'pipe'],
    });
    let stdout = '', stderr = '';
    child.stdout.on('data', data => { stdout += data; });
    child.stderr.on('data', data => { stderr += data; });
    child.once('error', reject);
    child.once('close', (code, signal) => {
      child = null;
      if (stopped) return resolve([]);
      if (code !== 0) return reject(Error(`Driver ${command} failed (${code ?? signal}): ${stderr}`));
      try {
        const events = stdout.trim().split('\n').filter(Boolean).map(JSON.parse);
        if (!events.length) throw Error('Driver returned no event.');
        resolve(events);
      } catch (error) { reject(error); }
    });
  });
}

function stop() {
  stopped = true;
  if (child) child.kill();
}
process.on('SIGINT', stop);
process.on('SIGTERM', stop);
process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
  const command = data.trim().toLowerCase();
  if (command === 'stop') stop();
  if (command === 'pause') paused = true; // Finish the current request, then yield.
});
// A closed supervisor input must not leave a discovery process advancing alone.
process.stdin.on('end', stop);

try {
  fs.mkdirSync(logDir, { recursive: true });
  lock = fs.openSync(lockPath, 'wx');
  fs.writeFileSync(lock, JSON.stringify({ pid: process.pid, startedAt: new Date().toISOString() }) + '\n');
  const [status] = await run('status');
  if (!status) {
    emit({ event: 'batch_stopped', stopped: true, reason: 'Supervisor input closed before discovery.' });
  } else {
  let completed = status.completed;
  let processed = 0;
  emit({ event: 'batch_started', total: status.total, completed, limit, prefetchMode });
  if (status.current && !prefetchMode) {
    emit({ event: 'pending_pair', current: status.current });
  } else if (prefetchMode && !status.current) {
    emit({ event: 'no_current_pair' });
  } else {
    while (!stopped && !paused && processed < limit) {
      const events = await run(prefetchMode ? 'prefetch-advance' : 'next');
      for (const event of events) {
        if (event.event === 'completed') { completed = event.completed ?? completed + 1; processed++; }
        if (event.event === 'completed') {
          // Full reasons and artifacts remain in the driver's JSONL log.
          emit({ event: event.event, key: event.key, status: event.status,
            elapsedSeconds: event.elapsedSeconds, completed, total: status.total });
        } else {
          emit({ ...event, completed, total: status.total });
        }
      }
      // Continue only a model found:false completion, never review a candidate
      // automatically or treat a deadline/environment error as not_found.
      if (events.length !== 1 || events[0].event !== 'completed'
          || events[0].status !== 'not_found') break;
    }
  }
  emit({ event: 'batch_stopped', completed, stopped, paused, prefetchMode });
  }
} catch (error) {
  emit({ event: 'batch_error', reason: String(error) });
  process.exitCode = 1;
} finally {
  process.stdin.pause();
  if (lock !== undefined) {
    fs.closeSync(lock);
    fs.unlinkSync(lockPath);
  }
}
