package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairByteArrayStringTestSupport.*;

class ClonePair1332NoDifferenceTest {

    private final ClonePair1332 subject = new ClonePair1332();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertBothMethodsReturn("", new byte[]{});
        assertBothMethodsReturn("00", new byte[]{0});
        assertBothMethodsReturn("0F", new byte[]{15});
        assertBothMethodsReturn("10", new byte[]{16});
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertBothMethodsThrow("java.lang.NullPointerException", null);
    }

    private void assertBothMethodsReturn(String expected, byte[] input) {
        InvocationOutcome method1Outcome = capture(subject::method1, input);
        InvocationOutcome method2Outcome = capture(subject::method2, input);

        assertEquals("OK", method1Outcome.status);
        assertEquals("OK", method2Outcome.status);
        assertEquals(expected, method1Outcome.value);
        assertEquals(expected, method2Outcome.value);
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
