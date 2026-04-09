package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairObjectIntegerTestSupport.*;

class ClonePair1656DifferenceFindingTest {

    private final ClonePair1656 subject = new ClonePair1656();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, Long.valueOf(3L));
        InvocationOutcome method2Outcome = capture(subject::method2, Long.valueOf(3L));

        assertEquals("OK", method1Outcome.status);
        assertNull(method1Outcome.value);
        assertNull(method1Outcome.exceptionClass);
        assertEquals("OK", method2Outcome.status);
        assertEquals(Integer.valueOf(3), method2Outcome.value);
        assertNull(method2Outcome.exceptionClass);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertInputStatePreserved(method1Outcome);
        assertInputStatePreserved(method2Outcome);
    }
}
