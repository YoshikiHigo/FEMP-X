package inequivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair956DifferenceFindingTest {

    private final ClonePair956 subject = new ClonePair956();

    @Test
    void methodsHaveDifferentStdoutSideEffectsForValidSingleBaseInput() {
        CapturedCall method1 = captureStdout(() -> subject.method1(new String[]{"A"}));
        CapturedCall method2 = captureStdout(() -> subject.method2(new String[]{"A"}));

        assertEquals(1, method1.result[0][0]);
        assertEquals(1, method2.result[0][0]);
        assertEquals("", method1.output);
        assertEquals("      \tAs\tCs\tGs\tTs" + System.lineSeparator() + "Pos: 1\t1\t0\t0\t0" + System.lineSeparator(), method2.output);
    }

    private static CapturedCall captureStdout(IntMatrixCall call) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (PrintStream capturedOut = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
            System.setOut(capturedOut);
            int[][] result = call.run();
            capturedOut.flush();
            return new CapturedCall(result, buffer.toString(StandardCharsets.UTF_8));
        } finally {
            System.setOut(originalOut);
        }
    }

    @FunctionalInterface
    private interface IntMatrixCall {
        int[][] run();
    }

    private static final class CapturedCall {

        private final int[][] result;
        private final String output;

        private CapturedCall(int[][] result, String output) {
            this.result = result;
            this.output = output;
        }
    }
}
