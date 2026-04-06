package inequivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair10436DifferenceFindingTest {
    @Test
    void method1WritesStackTraceForInvalidIntegerButMethod2DoesNot() {
        ClonePair10436 clonePair = new ClonePair10436();
        PrintStream originalErr = System.err;
        ByteArrayOutputStream method1Err = new ByteArrayOutputStream();
        ByteArrayOutputStream method2Err = new ByteArrayOutputStream();

        try {
            System.setErr(new PrintStream(method1Err));
            assertNull(clonePair.method1("x"));

            System.setErr(new PrintStream(method2Err));
            assertNull(clonePair.method2("x"));
        } finally {
            System.setErr(originalErr);
        }

        assertFalse(method1Err.toString().isEmpty());
        assertEquals("", method2Err.toString());
    }
}
