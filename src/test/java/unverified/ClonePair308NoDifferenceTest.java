package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairByteArrayTestSupport.*;

class ClonePair308NoDifferenceTest {

    private final ClonePair308 subject = new ClonePair308();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertBothMethodsReturn(true, new byte[]{}, new byte[]{});
        assertBothMethodsReturn(true, new byte[]{1}, new byte[]{1});
        assertBothMethodsReturn(false, new byte[]{1}, new byte[]{2});
        assertBothMethodsReturn(false, new byte[]{1}, new byte[]{});
        assertBothMethodsReturn(false, new byte[]{1}, new byte[]{1, 2});
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertBothMethodsThrow("java.lang.NullPointerException", null, new byte[]{});
    }

    private void assertBothMethodsReturn(boolean expected, byte[] left, byte[] right) {
        InvocationOutcome method1Outcome = capture(subject::method1, left, right);
        InvocationOutcome method2Outcome = capture(subject::method2, left, right);

        assertEquals("OK", method1Outcome.status);
        assertEquals("OK", method2Outcome.status);
        assertEquals(expected, method1Outcome.value);
        assertEquals(expected, method2Outcome.value);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
        assertInputStatePreserved(method1Outcome);
        assertInputStatePreserved(method2Outcome);
    }

    private void assertBothMethodsThrow(String exceptionClass, byte[] left, byte[] right) {
        InvocationOutcome method1Outcome = capture(subject::method1, left, right);
        InvocationOutcome method2Outcome = capture(subject::method2, left, right);

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
