package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairStringDoubleTestSupport.*;

class ClonePair2435DifferenceFindingTest {

    private final ClonePair2435 subject = new ClonePair2435();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, " ");
        InvocationOutcome method2Outcome = capture(subject::method2, " ");

        assertEquals("EX", method1Outcome.status);
        assertEquals("java.lang.NumberFormatException", method1Outcome.exceptionClass);
        assertNull(method1Outcome.value);
        assertEquals("OK", method2Outcome.status);
        assertEquals(Double.valueOf("0.0"), method2Outcome.value);
        assertNull(method2Outcome.exceptionClass);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
    }
}
