package inequivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair2646DifferenceFindingTest {

    private final ClonePair2646 subject = new ClonePair2646();

    @Test
    void methodsHaveDifferentStdoutSideEffectsForEqualArrays() {
        CapturedCall method1 = captureStdout(() -> subject.method1(new byte[]{1}, new byte[]{1}));
        CapturedCall method2 = captureStdout(() -> subject.method2(new byte[]{1}, new byte[]{1}));

        assertEquals(true, method1.result);
        assertEquals(true, method2.result);
        assertEquals("", method1.output);
        assertEquals("==1==1" + System.lineSeparator() + ">[1]" + System.lineSeparator() + ">[1]" + System.lineSeparator(), method2.output);
    }

    private static CapturedCall captureStdout(BooleanCall call) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (PrintStream capturedOut = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
            System.setOut(capturedOut);
            boolean result = call.run();
            capturedOut.flush();
            return new CapturedCall(result, buffer.toString(StandardCharsets.UTF_8));
        } finally {
            System.setOut(originalOut);
        }
    }

    @FunctionalInterface
    private interface BooleanCall {
        boolean run();
    }

    private static final class CapturedCall {

        private final boolean result;
        private final String output;

        private CapturedCall(boolean result, String output) {
            this.result = result;
            this.output = output;
        }
    }
}
