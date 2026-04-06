package inequivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7259DifferenceFindingTest {
    @Test
    void methodsDifferInStdoutSideEffect() {
        ClonePair7259 clonePair = new ClonePair7259();

        CapturedCall method1 = captureStdout(() -> clonePair.method1(Collections.singletonList(1)));
        CapturedCall method2 = captureStdout(() -> clonePair.method2(Collections.singletonList(1)));

        assertEquals(1, method1.result);
        assertEquals(1, method2.result);
        assertTrue(method1.output.contains("PartialCalls.sum([1]) = 1"));
        assertTrue(method2.output.isEmpty());
    }

    private static CapturedCall captureStdout(IntCall call) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (PrintStream capturedOut = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
            System.setOut(capturedOut);
            int result = call.run();
            capturedOut.flush();
            return new CapturedCall(result, buffer.toString(StandardCharsets.UTF_8));
        } finally {
            System.setOut(originalOut);
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
