package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairCollectionBooleanTestSupport.*;

class ClonePair1522NoDifferenceTest {

    private final ClonePair1522 subject = new ClonePair1522();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertBothMethodsReturn(true, collection(), collection());
        assertBothMethodsReturn(true, collection("alpha"), collection("alpha"));
        assertBothMethodsReturn(false, collection("alpha"), collection("beta"));
        assertBothMethodsReturn(true, collection("alpha", "beta"), collection("alpha", "beta"));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertBothMethodsThrow("java.lang.NullPointerException", null, null);
        assertBothMethodsThrow("java.lang.NullPointerException", null, collection());
    }

    private void assertBothMethodsReturn(boolean expected, java.util.Collection left, java.util.Collection right) {
        InvocationOutcome method1Outcome = capture(subject::method1, left, right);
        InvocationOutcome method2Outcome = capture(subject::method2, left, right);

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

    private void assertBothMethodsThrow(String exceptionClass, java.util.Collection left, java.util.Collection right) {
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
