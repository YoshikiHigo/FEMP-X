package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairStringDoubleTestSupport.*;

class ClonePair3128DifferenceFindingTest {

    private final ClonePair3128 subject = new ClonePair3128();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, " ");
        InvocationOutcome method2Outcome = capture(subject::method2, " ");

        assertEquals("OK", method1Outcome.status);
        assertEquals(Double.valueOf("0.0"), method1Outcome.value);
        assertNull(method1Outcome.exceptionClass);
        assertEquals("EX", method2Outcome.status);
        assertEquals("java.lang.NumberFormatException", method2Outcome.exceptionClass);
        assertNull(method2Outcome.value);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
    }
}
