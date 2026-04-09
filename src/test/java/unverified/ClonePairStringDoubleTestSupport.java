package unverified;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

final class ClonePairStringDoubleTestSupport {

    @FunctionalInterface
    interface DoubleInvocation {
        double invoke(String input) throws Throwable;
    }

    static final class InvocationOutcome {

        final String status;
        final Double value;
        final String exceptionClass;
        final String stdout;
        final String stderr;

        private InvocationOutcome(
            String status,
            Double value,
            String exceptionClass,
            String stdout,
            String stderr
        ) {
            this.status = status;
            this.value = value;
            this.exceptionClass = exceptionClass;
            this.stdout = stdout;
            this.stderr = stderr;
        }
    }

    private ClonePairStringDoubleTestSupport() {
    }

    static InvocationOutcome capture(DoubleInvocation invocation, String input) {
        ByteArrayOutputStream stdoutBuffer = new ByteArrayOutputStream();
        ByteArrayOutputStream stderrBuffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        PrintStream capturedOut = new PrintStream(stdoutBuffer, true);
        PrintStream capturedErr = new PrintStream(stderrBuffer, true);
        try {
            System.setOut(capturedOut);
            System.setErr(capturedErr);
            return new InvocationOutcome(
                "OK",
                invocation.invoke(input),
                null,
                bufferAsString(stdoutBuffer),
                bufferAsString(stderrBuffer)
            );
        } catch (Throwable throwable) {
            return new InvocationOutcome(
                "EX",
                null,
                throwable.getClass().getName(),
                bufferAsString(stdoutBuffer),
                bufferAsString(stderrBuffer)
            );
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
            capturedOut.close();
            capturedErr.close();
        }
    }

    private static String bufferAsString(ByteArrayOutputStream output) {
        return new String(output.toByteArray(), StandardCharsets.UTF_8);
    }
}
