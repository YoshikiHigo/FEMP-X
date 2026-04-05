package inequivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair13558DifferenceFindingTest {

    private final ClonePair13558 subject = new ClonePair13558();

    @Test
    void methodsHaveDifferentStdoutSideEffectsForOddLengthHexString() {
        CapturedCall method1 = captureStdout(() -> subject.method1("foo"));
        CapturedCall method2 = captureStdout(() -> subject.method2("foo"));

        assertEquals(null, method1.result);
        assertEquals(null, method2.result);
        assertEquals("Hex encoded string must be of even length" + System.lineSeparator(), method1.output);
        assertEquals("", method2.output);
    }

    private static CapturedCall captureStdout(ByteArrayCall call) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (PrintStream capturedOut = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
            System.setOut(capturedOut);
            byte[] result = call.run();
            capturedOut.flush();
            return new CapturedCall(result, buffer.toString(StandardCharsets.UTF_8));
        } finally {
            System.setOut(originalOut);
        }
    }

    @FunctionalInterface
    private interface ByteArrayCall {
        byte[] run();
    }

    private static final class CapturedCall {

        private final byte[] result;
        private final String output;

        private CapturedCall(byte[] result, String output) {
            this.result = result;
            this.output = output;
        }
    }
}
