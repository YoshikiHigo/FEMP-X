package inequivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12919DifferenceFindingTest {
    @Test
    void onlyMethod2WritesToStdout() {
        ClonePair12919 clonePair = new ClonePair12919();
        Vector<String> values = new Vector<>();
        values.add("a");
        PrintStream originalOut = System.out;
        ByteArrayOutputStream method1Out = new ByteArrayOutputStream();
        ByteArrayOutputStream method2Out = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(method1Out));
            assertTrue(clonePair.method1("a", values));

            System.setOut(new PrintStream(method2Out));
            assertTrue(clonePair.method2("a", values));
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("", method1Out.toString());
        assertFalse(method2Out.toString().isEmpty());
    }
}
