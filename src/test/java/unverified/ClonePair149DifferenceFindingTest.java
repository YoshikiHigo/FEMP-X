package unverified;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair149DifferenceFindingTest {

    private final ClonePair149 subject = new ClonePair149();

    @Test
    void methodsDisagreeOnStandardOutputSideEffectsForMismatchedArrays() {
        ByteArrayOutputStream method1Out = new ByteArrayOutputStream();
        ByteArrayOutputStream method2Out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(method1Out));
            assertFalse(subject.method1(new byte[]{1}, new byte[]{2}));
            System.setOut(new PrintStream(method2Out));
            assertFalse(subject.method2(new byte[]{1}, new byte[]{2}));
        } finally {
            System.setOut(originalOut);
        }

        assertEquals(0, method1Out.size());
        assertTrue(method2Out.size() > 0);
    }
}
