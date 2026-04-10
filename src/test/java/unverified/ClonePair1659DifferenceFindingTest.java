package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairObjectIntegerTestSupport.*;

class ClonePair1659DifferenceFindingTest {

    private final ClonePair1659 subject = new ClonePair1659();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, "42");
        InvocationOutcome method2Outcome = capture(subject::method2, "42");

        assertEquals("OK", method1Outcome.status);
        assertEquals(Integer.valueOf(42), method1Outcome.value);
        assertNull(method1Outcome.exceptionClass);
        assertEquals("OK", method2Outcome.status);
        assertNull(method2Outcome.value);
        assertNull(method2Outcome.exceptionClass);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertInputStatePreserved(method1Outcome);
        assertInputStatePreserved(method2Outcome);
    }
}
