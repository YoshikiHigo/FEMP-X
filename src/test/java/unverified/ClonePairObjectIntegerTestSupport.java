package unverified;

import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

final class ClonePairObjectIntegerTestSupport {

    @FunctionalInterface
    interface IntegerInvocation {
        Integer invoke(Object input) throws Throwable;
    }

    static final class InvocationOutcome {

        final String status;
        final Integer value;
        final String exceptionClass;
        final String stdout;
        final String stderr;
        final String originalInputSnapshot;
        final String inputAfterSnapshot;

        private InvocationOutcome(
            String status,
            Integer value,
            String exceptionClass,
            String stdout,
            String stderr,
            String originalInputSnapshot,
            String inputAfterSnapshot
        ) {
            this.status = status;
            this.value = value;
            this.exceptionClass = exceptionClass;
            this.stdout = stdout;
            this.stderr = stderr;
            this.originalInputSnapshot = originalInputSnapshot;
            this.inputAfterSnapshot = inputAfterSnapshot;
        }
    }

    static final class ToStringObject {
        final String text;

        ToStringObject(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    static final class ThrowingToStringObject {
        @Override
        public String toString() {
            throw new IllegalStateException("boom");
        }
    }

    private ClonePairObjectIntegerTestSupport() {
    }

    static Object textObject(String text) {
        return new ToStringObject(text);
    }

    static Object builder(String text) {
        return new StringBuilder(text);
    }

    static Object atomicInt(int value) {
        return new AtomicInteger(value);
    }

    static Object throwingToStringObject() {
        return new ThrowingToStringObject();
    }

    static InvocationOutcome capture(IntegerInvocation invocation, Object input) {
        Object actualInput = cloneInput(input);
        String originalInputSnapshot = snapshot(actualInput);
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
                originalInputSnapshot,
                snapshot(actualInput)
            );
        } catch (Throwable throwable) {
            return new InvocationOutcome(
                "EX",
                null,
                throwable.getClass().getName(),
                bufferAsString(stdoutBuffer),
                bufferAsString(stderrBuffer),
                originalInputSnapshot,
                snapshot(actualInput)
            );
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
            capturedOut.close();
            capturedErr.close();
        }
    }

    static void assertInputStatePreserved(InvocationOutcome outcome) {
        Assertions.assertEquals(outcome.originalInputSnapshot, outcome.inputAfterSnapshot);
    }

    private static Object cloneInput(Object input) {
        if (input == null || input instanceof String || input instanceof Number || input instanceof Boolean) {
            return input;
        }
        if (input instanceof StringBuilder) {
            return new StringBuilder(input.toString());
        }
        if (input instanceof AtomicInteger) {
            return new AtomicInteger(((AtomicInteger) input).get());
        }
        if (input instanceof ToStringObject) {
            return new ToStringObject(((ToStringObject) input).text);
        }
        if (input instanceof ThrowingToStringObject) {
            return new ThrowingToStringObject();
        }
        throw new IllegalArgumentException("Unsupported input type: " + input.getClass().getName());
    }

    private static String snapshot(Object input) {
        if (input == null) {
            return "null";
        }
        if (input instanceof StringBuilder) {
            return "StringBuilder:" + input;
        }
        if (input instanceof AtomicInteger) {
            return "AtomicInteger:" + ((AtomicInteger) input).get();
        }
        if (input instanceof ToStringObject) {
            return "ToStringObject:" + ((ToStringObject) input).text;
        }
        if (input instanceof ThrowingToStringObject) {
            return "ThrowingToStringObject";
        }
        return input.getClass().getName() + ":" + String.valueOf(input);
    }

    private static String bufferAsString(ByteArrayOutputStream output) {
        return new String(output.toByteArray(), StandardCharsets.UTF_8);
    }
}
