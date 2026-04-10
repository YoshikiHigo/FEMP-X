package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairStringDoubleTestSupport.*;

class ClonePair2839NoDifferenceTest {

    private final ClonePair2839 subject = new ClonePair2839();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertBothMethodsReturn(Double.valueOf("0.0"), "");
        assertBothMethodsReturn(Double.valueOf("0.0"), " ");
        assertBothMethodsReturn(Double.valueOf("0.0"), "\t");
        assertBothMethodsReturn(Double.valueOf("0.0"), "0");
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertBothMethodsThrow("java.lang.NullPointerException", null);
    }

    private void assertBothMethodsReturn(Double expected, String input) {
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
    }

    private void assertBothMethodsThrow(String exceptionClass, String input) {
        InvocationOutcome method1Outcome = capture(subject::method1, input);
        InvocationOutcome method2Outcome = capture(subject::method2, input);

        assertEquals("EX", method1Outcome.status);
        assertEquals("EX", method2Outcome.status);
        assertEquals(exceptionClass, method1Outcome.exceptionClass);
        assertEquals(exceptionClass, method2Outcome.exceptionClass);
        assertEquals(method1Outcome.stdout, method2Outcome.stdout);
        assertEquals(method1Outcome.stderr, method2Outcome.stderr);
    }
}
