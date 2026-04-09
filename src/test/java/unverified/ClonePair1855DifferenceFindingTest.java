package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairListStringTestSupport.*;

class ClonePair1855DifferenceFindingTest {

    private final ClonePair1855 subject = new ClonePair1855();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, list("alpha"));
        InvocationOutcome method2Outcome = capture(subject::method2, list("alpha"));

        assertEquals("OK", method1Outcome.status);
        assertNull(method1Outcome.exceptionClass);
        assertEquals("alpha", method1Outcome.value);
        assertEquals("OK", method2Outcome.status);
        assertNull(method2Outcome.exceptionClass);
        assertEquals("alpha ", method2Outcome.value);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertInputStatePreserved(method1Outcome);
        assertInputStatePreserved(method2Outcome);
    }
}
