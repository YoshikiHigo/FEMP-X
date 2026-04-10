package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairStringDoubleTestSupport.*;

class ClonePair2997DifferenceFindingTest {

    private final ClonePair2997 subject = new ClonePair2997();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, "1,5");
        InvocationOutcome method2Outcome = capture(subject::method2, "1,5");

        assertEquals("OK", method1Outcome.status);
        assertEquals(Double.valueOf("1.5"), method1Outcome.value);
        assertNull(method1Outcome.exceptionClass);
        assertEquals("EX", method2Outcome.status);
        assertEquals("java.lang.NumberFormatException", method2Outcome.exceptionClass);
        assertNull(method2Outcome.value);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
    }
}
