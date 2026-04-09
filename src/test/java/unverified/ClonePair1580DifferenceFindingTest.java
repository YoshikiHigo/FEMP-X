package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static unverified.ClonePairByteArrayTestSupport.*;

class ClonePair1580DifferenceFindingTest {

    private final ClonePair1580 subject = new ClonePair1580();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, null, null);
        InvocationOutcome method2Outcome = capture(subject::method2, null, null);

        assertEquals("OK", method1Outcome.status);
        assertEquals(true, method1Outcome.value);
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
