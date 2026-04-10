package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairObjectIntegerTestSupport.*;

class ClonePair1641NoDifferenceTest {

    private final ClonePair1641 subject = new ClonePair1641();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertBothMethodsReturn(null, null);
        assertBothMethodsReturn(Integer.valueOf(7), Integer.valueOf(7));
        assertBothMethodsReturn(Integer.valueOf(3), Long.valueOf(3L));
        assertBothMethodsReturn(Integer.valueOf(3), Double.valueOf(3.9));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertBothMethodsThrow("java.lang.NumberFormatException", Boolean.TRUE);
        assertBothMethodsThrow("java.lang.NumberFormatException", Boolean.FALSE);
    }

    private void assertBothMethodsReturn(Integer expected, Object input) {
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

    private void assertBothMethodsThrow(String exceptionClass, Object input) {
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
