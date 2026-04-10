package unverified;

import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

final class ClonePairByteArrayBooleanUnaryTestSupport {

    @FunctionalInterface
    interface BooleanInvocation {
        boolean invoke(byte[] input) throws Throwable;
    }

    static final class InvocationOutcome {

        final String status;
        final Boolean value;
        final String exceptionClass;
        final String stdout;
        final String stderr;
        final byte[] originalInput;
        final byte[] inputAfter;

        private InvocationOutcome(
            String status,
            Boolean value,
            String exceptionClass,
            String stdout,
            String stderr,
            byte[] originalInput,
            byte[] inputAfter
        ) {
            this.status = status;
            this.value = value;
            this.exceptionClass = exceptionClass;
            this.stdout = stdout;
            this.stderr = stderr;
            this.originalInput = originalInput;
            this.inputAfter = inputAfter;
        }
    }

    private ClonePairByteArrayBooleanUnaryTestSupport() {
    }

    static InvocationOutcome capture(BooleanInvocation invocation, byte[] input) {
        byte[] actualInput = cloneOrNull(input);
        byte[] originalInput = cloneOrNull(actualInput);
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
                invocation.invoke(actualInput),
                null,
                bufferAsString(stdoutBuffer),
                bufferAsString(stderrBuffer),
                originalInput,
                actualInput
            );
        } catch (Throwable throwable) {
            return new InvocationOutcome(
                "EX",
                null,
                throwable.getClass().getName(),
                bufferAsString(stdoutBuffer),
                bufferAsString(stderrBuffer),
                originalInput,
                actualInput
            );
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
            capturedOut.close();
            capturedErr.close();
        }
    }

    static void assertInputStatePreserved(InvocationOutcome outcome) {
        if (outcome.originalInput == null) {
            Assertions.assertNull(outcome.inputAfter);
            return;
        }
        Assertions.assertArrayEquals(outcome.originalInput, outcome.inputAfter);
    }

    private static byte[] cloneOrNull(byte[] value) {
        return value == null ? null : value.clone();
    }

    private static String bufferAsString(ByteArrayOutputStream output) {
        return new String(output.toByteArray(), StandardCharsets.UTF_8);
    }
}
