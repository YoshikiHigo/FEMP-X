package unverified;

import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

final class ClonePairByteArrayTestSupport {

    @FunctionalInterface
    interface ByteArrayBooleanInvocation {
        boolean invoke(byte[] left, byte[] right) throws Throwable;
    }

    static final class InvocationOutcome {

        final String status;
        final Boolean value;
        final String exceptionClass;
        final String stdout;
        final String stderr;
        final byte[] originalLeft;
        final byte[] originalRight;
        final byte[] leftAfter;
        final byte[] rightAfter;

        private InvocationOutcome(
            String status,
            Boolean value,
            String exceptionClass,
            String stdout,
            String stderr,
            byte[] originalLeft,
            byte[] originalRight,
            byte[] leftAfter,
            byte[] rightAfter
        ) {
            this.status = status;
            this.value = value;
            this.exceptionClass = exceptionClass;
            this.stdout = stdout;
            this.stderr = stderr;
            this.originalLeft = originalLeft;
            this.originalRight = originalRight;
            this.leftAfter = leftAfter;
            this.rightAfter = rightAfter;
        }
    }

    private ClonePairByteArrayTestSupport() {
    }

    static InvocationOutcome capture(ByteArrayBooleanInvocation invocation, byte[] left, byte[] right) {
        byte[] leftInput = cloneOrNull(left);
        byte[] rightInput = cloneOrNull(right);
        byte[] originalLeft = cloneOrNull(leftInput);
        byte[] originalRight = cloneOrNull(rightInput);
        ByteArrayOutputStream stdoutBuffer = new ByteArrayOutputStream();
        ByteArrayOutputStream stderrBuffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        PrintStream capturedOut = new PrintStream(stdoutBuffer, true);
        PrintStream capturedErr = new PrintStream(stderrBuffer, true);
        try {
            System.setOut(capturedOut);
            System.setErr(capturedErr);
            boolean value = invocation.invoke(leftInput, rightInput);
            return new InvocationOutcome(
                "OK",
                value,
                null,
                bufferAsString(stdoutBuffer),
                bufferAsString(stderrBuffer),
                originalLeft,
                originalRight,
                leftInput,
                rightInput
            );
        } catch (Throwable throwable) {
            return new InvocationOutcome(
                "EX",
                null,
                throwable.getClass().getName(),
                bufferAsString(stdoutBuffer),
                bufferAsString(stderrBuffer),
                originalLeft,
                originalRight,
                leftInput,
                rightInput
            );
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
            capturedOut.close();
            capturedErr.close();
        }
    }

    static void assertArrayEqualsOrNull(byte[] expected, byte[] actual) {
        if (expected == null) {
            Assertions.assertNull(actual);
            return;
        }
        Assertions.assertArrayEquals(expected, actual);
    }

    static void assertInputStatePreserved(InvocationOutcome outcome) {
        assertArrayEqualsOrNull(outcome.originalLeft, outcome.leftAfter);
        assertArrayEqualsOrNull(outcome.originalRight, outcome.rightAfter);
    }

    private static byte[] cloneOrNull(byte[] value) {
        return value == null ? null : value.clone();
    }

    private static String bufferAsString(ByteArrayOutputStream output) {
        return new String(output.toByteArray(), StandardCharsets.UTF_8);
    }
}
