package unverified;

import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

final class ClonePairCollectionBooleanTestSupport {

    @FunctionalInterface
    interface CollectionBooleanInvocation {
        boolean invoke(Collection left, Collection right) throws Throwable;
    }

    static final class InvocationOutcome {

        final String status;
        final Boolean value;
        final String exceptionClass;
        final String stdout;
        final String stderr;
        final Collection originalLeft;
        final Collection originalRight;
        final Collection leftAfter;
        final Collection rightAfter;

        private InvocationOutcome(
            String status,
            Boolean value,
            String exceptionClass,
            String stdout,
            String stderr,
            Collection originalLeft,
            Collection originalRight,
            Collection leftAfter,
            Collection rightAfter
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

    private ClonePairCollectionBooleanTestSupport() {
    }

    static Collection collection(Object... values) {
        return new ArrayList(Arrays.asList(values));
    }

    static InvocationOutcome capture(CollectionBooleanInvocation invocation, Collection left, Collection right) {
        Collection actualLeft = cloneOrNull(left);
        Collection actualRight = cloneOrNull(right);
        Collection originalLeft = cloneOrNull(actualLeft);
        Collection originalRight = cloneOrNull(actualRight);
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
                invocation.invoke(actualLeft, actualRight),
                null,
                bufferAsString(stdoutBuffer),
                bufferAsString(stderrBuffer),
                originalLeft,
                originalRight,
                actualLeft,
                actualRight
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
                actualLeft,
                actualRight
            );
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
            capturedOut.close();
            capturedErr.close();
        }
    }

    static void assertInputStatePreserved(InvocationOutcome outcome) {
        if (outcome.originalLeft == null) {
            Assertions.assertNull(outcome.leftAfter);
        } else {
            Assertions.assertEquals(outcome.originalLeft, outcome.leftAfter);
        }
        if (outcome.originalRight == null) {
            Assertions.assertNull(outcome.rightAfter);
        } else {
            Assertions.assertEquals(outcome.originalRight, outcome.rightAfter);
        }
    }

    private static Collection cloneOrNull(Collection value) {
        return value == null ? null : new ArrayList(value);
    }

    private static String bufferAsString(ByteArrayOutputStream output) {
        return new String(output.toByteArray(), StandardCharsets.UTF_8);
    }
}
