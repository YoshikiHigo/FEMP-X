package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static unverified.ClonePairByteArrayTestSupport.*;

class ClonePair657DifferenceFindingTest {

    private final ClonePair657 subject = new ClonePair657();

    @Test
    void methodsDisagreeOnStandardOutputSideEffectsForGeneratedInput() {
        InvocationOutcome method1Outcome = capture(subject::method1, new byte[]{1}, new byte[]{2});
        InvocationOutcome method2Outcome = capture(subject::method2, new byte[]{1}, new byte[]{2});
        String lineSeparator = System.lineSeparator();

        assertEquals("OK", method1Outcome.status);
        assertEquals(false, method1Outcome.value);
        assertNull(method1Outcome.exceptionClass);
        assertEquals("OK", method2Outcome.status);
        assertEquals(false, method2Outcome.value);
        assertNull(method2Outcome.exceptionClass);
        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals("diff byte at 0" + lineSeparator, method1Outcome.stdout);
        assertEquals("", method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertInputStatePreserved(method1Outcome);
        assertInputStatePreserved(method2Outcome);
    }
}
