package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairStringDoubleTestSupport.*;

class ClonePair3108DifferenceFindingTest {

    private final ClonePair3108 subject = new ClonePair3108();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, "1,5");
        InvocationOutcome method2Outcome = capture(subject::method2, "1,5");

        assertEquals("OK", method1Outcome.status);
        assertEquals(Double.valueOf("15.0"), method1Outcome.value);
        assertNull(method1Outcome.exceptionClass);
        assertEquals("OK", method2Outcome.status);
        assertEquals(Double.valueOf("0.0"), method2Outcome.value);
        assertNull(method2Outcome.exceptionClass);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
    }
}
