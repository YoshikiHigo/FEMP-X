package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static unverified.ClonePairByteArrayTestSupport.*;

class ClonePair1462DifferenceFindingTest {

    private final ClonePair1462 subject = new ClonePair1462();

    @Test
    void methodsDisagreeOnStandardOutputSideEffectsForGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, new byte[]{}, new byte[]{});
        InvocationOutcome method2Outcome = capture(subject::method2, new byte[]{}, new byte[]{});
        String lineSeparator = System.lineSeparator();

        assertEquals("OK", method1Outcome.status);
        assertEquals(true, method1Outcome.value);
        assertNull(method1Outcome.exceptionClass);
        assertEquals("OK", method2Outcome.status);
        assertEquals(true, method2Outcome.value);
        assertNull(method2Outcome.exceptionClass);
        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals("", method1Outcome.stdout);
        assertEquals("==0==0" + lineSeparator + ">[]" + lineSeparator + ">[]" + lineSeparator, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertInputStatePreserved(method1Outcome);
        assertInputStatePreserved(method2Outcome);
    }
}
