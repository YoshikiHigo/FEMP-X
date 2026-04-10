package unverified;

import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class ClonePairListStringTestSupport {

    @FunctionalInterface
    interface StringInvocation {
        String invoke(List input) throws Throwable;
    }

    static final class InvocationOutcome {

        final String status;
        final String value;
        final String exceptionClass;
        final String stdout;
        final String stderr;
        final List originalInput;
        final List inputAfter;

        private InvocationOutcome(
            String status,
            String value,
            String exceptionClass,
            String stdout,
            String stderr,
            List originalInput,
            List inputAfter
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

    private ClonePairListStringTestSupport() {
    }

    static List list(Object... values) {
        return new ArrayList(Arrays.asList(values));
    }

    static InvocationOutcome capture(StringInvocation invocation, List input) {
        List actualInput = cloneOrNull(input);
        List originalInput = cloneOrNull(actualInput);
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
        Assertions.assertEquals(outcome.originalInput, outcome.inputAfter);
    }

    private static List cloneOrNull(List value) {
        return value == null ? null : new ArrayList(value);
    }

    private static String bufferAsString(ByteArrayOutputStream output) {
        return new String(output.toByteArray(), StandardCharsets.UTF_8);
    }
}
