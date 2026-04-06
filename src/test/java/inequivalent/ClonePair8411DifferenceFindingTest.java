package inequivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8411DifferenceFindingTest {
    @Test
    void methodsInterpretAsteriskDifferently() {
        ClonePair8411 clonePair = new ClonePair8411();
        PrintStream originalOut = System.out;
        try (PrintStream capturedOut = new PrintStream(new ByteArrayOutputStream(), true, StandardCharsets.UTF_8)) {
            System.setOut(capturedOut);

            assertFalse(clonePair.method1("abc", "a*"));
        } finally {
            System.setOut(originalOut);
        }
        assertTrue(clonePair.method2("abc", "a*"));
    }
}
