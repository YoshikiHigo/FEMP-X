package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairStringDoubleTestSupport.*;

class ClonePair2949DifferenceFindingTest {

    private final ClonePair2949 subject = new ClonePair2949();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, "1+2");
        InvocationOutcome method2Outcome = capture(subject::method2, "1+2");

        assertEquals("EX", method1Outcome.status);
        assertEquals("java.lang.NumberFormatException", method1Outcome.exceptionClass);
        assertNull(method1Outcome.value);
        assertEquals("OK", method2Outcome.status);
        assertEquals(Double.valueOf("3.0"), method2Outcome.value);
        assertNull(method2Outcome.exceptionClass);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
    }
}
