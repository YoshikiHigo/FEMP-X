package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairByteArrayBooleanUnaryTestSupport.*;

class ClonePair2882NoDifferenceTest {

    private final ClonePair2882 subject = new ClonePair2882();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertBothMethodsReturn(false, new byte[]{});
        assertBothMethodsReturn(false, new byte[]{0});
        assertBothMethodsReturn(false, new byte[]{31});
        assertBothMethodsReturn(false, new byte[]{65});
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertBothMethodsThrow("java.lang.NullPointerException", null);
    }

    private void assertBothMethodsReturn(boolean expected, byte[] input) {
        InvocationOutcome method1Outcome = capture(subject::method1, input);
        InvocationOutcome method2Outcome = capture(subject::method2, input);

        assertEquals("OK", method1Outcome.status);
        assertEquals("OK", method2Outcome.status);
        assertEquals(expected, method1Outcome.value);
        assertEquals(expected, method2Outcome.value);
        assertNull(method1Outcome.exceptionClass);
        assertNull(method2Outcome.exceptionClass);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertInputStatePreserved(method1Outcome);
        assertInputStatePreserved(method2Outcome);
    }

    private void assertBothMethodsThrow(String exceptionClass, byte[] input) {
        InvocationOutcome method1Outcome = capture(subject::method1, input);
        InvocationOutcome method2Outcome = capture(subject::method2, input);

        assertEquals("EX", method1Outcome.status);
        assertEquals("EX", method2Outcome.status);
        assertEquals(exceptionClass, method1Outcome.exceptionClass);
        assertEquals(exceptionClass, method2Outcome.exceptionClass);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertInputStatePreserved(method1Outcome);
        assertInputStatePreserved(method2Outcome);
    }
}
