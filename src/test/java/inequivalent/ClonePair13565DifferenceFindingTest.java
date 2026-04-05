package inequivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair13565DifferenceFindingTest {

    private final ClonePair13565 subject = new ClonePair13565();

    @Test
    void methodsHaveDifferentStderrSideEffectsForInvalidHexDigit() {
        CapturedCall method1 = captureStderr(() -> subject.method1('.'));
        CapturedCall method2 = captureStderr(() -> subject.method2('.'));

        assertEquals(-1, method1.result);
        assertEquals(-1, method2.result);
        assertEquals("", method1.output);
        assertEquals("Error: '.' is not a hex digit" + System.lineSeparator(), method2.output);
    }

    private static CapturedCall captureStderr(IntCall call) {
        PrintStream originalErr = System.err;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (PrintStream capturedErr = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
            System.setErr(capturedErr);
            int result = call.run();
            capturedErr.flush();
            return new CapturedCall(result, buffer.toString(StandardCharsets.UTF_8));
        } finally {
            System.setErr(originalErr);
        }
    }

    @FunctionalInterface
    private interface IntCall {
        int run();
    }

    private static final class CapturedCall {

        private final int result;
        private final String output;

        private CapturedCall(int result, String output) {
            this.result = result;
            this.output = output;
        }
    }
}
