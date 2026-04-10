package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairByteArrayBooleanUnaryTestSupport.*;

class ClonePair3030DifferenceFindingTest {

    private final ClonePair3030 subject = new ClonePair3030();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, new byte[]{'I', 'D', '3', 3, 0, 0, 0, 0, 0, 0});
        InvocationOutcome method2Outcome = capture(subject::method2, new byte[]{'I', 'D', '3', 3, 0, 0, 0, 0, 0, 0});

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
