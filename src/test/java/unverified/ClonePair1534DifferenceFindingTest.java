package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairCollectionBooleanTestSupport.*;

class ClonePair1534DifferenceFindingTest {

    private final ClonePair1534 subject = new ClonePair1534();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, collection(), null);
        InvocationOutcome method2Outcome = capture(subject::method2, collection(), null);

        assertEquals("OK", method1Outcome.status);
        assertEquals(false, method1Outcome.value);
        assertNull(method1Outcome.exceptionClass);
        assertEquals("EX", method2Outcome.status);
        assertEquals("java.lang.NullPointerException", method2Outcome.exceptionClass);
        assertNull(method2Outcome.value);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertInputStatePreserved(method1Outcome);
        assertInputStatePreserved(method2Outcome);
    }
}
