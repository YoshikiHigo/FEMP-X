package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairByteArrayIntTestSupport.*;

class ClonePair2442NoDifferenceTest {

    private final ClonePair2442 subject = new ClonePair2442();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertBothMethodsReturn(0, new byte[]{0, 0, 0, 0});
        assertBothMethodsReturn(1, new byte[]{1, 0, 0, 0});
        assertBothMethodsReturn(256, new byte[]{0, 1, 0, 0});
        assertBothMethodsReturn(65536, new byte[]{0, 0, 1, 0});
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertBothMethodsThrow("java.lang.NullPointerException", null);
        assertBothMethodsThrow("java.lang.ArrayIndexOutOfBoundsException", new byte[]{});
    }

    private void assertBothMethodsReturn(int expected, byte[] input) {
        InvocationOutcome method1Outcome = capture(subject::method1, input);
        InvocationOutcome method2Outcome = capture(subject::method2, input);

        assertEquals("OK", method1Outcome.status);
        assertEquals("OK", method2Outcome.status);
        assertEquals(Integer.valueOf(expected), method1Outcome.value);
        assertEquals(Integer.valueOf(expected), method2Outcome.value);
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
