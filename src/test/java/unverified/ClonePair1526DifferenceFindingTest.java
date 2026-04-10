package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairCollectionBooleanTestSupport.*;

class ClonePair1526DifferenceFindingTest {

    private final ClonePair1526 subject = new ClonePair1526();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, collection(), collection());
        InvocationOutcome method2Outcome = capture(subject::method2, collection(), collection());

        assertEquals("OK", method1Outcome.status);
        assertEquals(true, method1Outcome.value);
        assertNull(method1Outcome.exceptionClass);
        assertEquals("OK", method2Outcome.status);
        assertEquals(false, method2Outcome.value);
        assertNull(method2Outcome.exceptionClass);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertInputStatePreserved(method1Outcome);
        assertInputStatePreserved(method2Outcome);
    }
}
