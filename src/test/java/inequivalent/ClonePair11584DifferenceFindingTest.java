package inequivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ClonePair11584DifferenceFindingTest {
    @Test
    void methodsReturnDifferentValuesAndStdout() {
        ClonePair11584 clonePair = new ClonePair11584();
        PrintStream originalOut = System.out;
        ByteArrayOutputStream method1Out = new ByteArrayOutputStream();
        ByteArrayOutputStream method2Out = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(method1Out));
            assertEquals("b", clonePair.method1("a: b", 10));

            System.setOut(new PrintStream(method2Out));
            assertEquals("a: b", clonePair.method2("a: b", 10));
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("", method1Out.toString());
        assertFalse(method2Out.toString().isEmpty());
    }
}
