package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair178NoDifferenceTest {

    private final ClonePair178 subject = new ClonePair178();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertTrue(subject.method1(new byte[]{1, 2}, new byte[]{1, 2}));
        assertTrue(subject.method2(new byte[]{1, 2}, new byte[]{1, 2}));

        assertFalse(subject.method1(new byte[]{1, 2}, new byte[]{1, 3}));
        assertFalse(subject.method2(new byte[]{1, 2}, new byte[]{1, 3}));

        assertFalse(subject.method1(new byte[]{1, 2}, new byte[]{1}));
        assertFalse(subject.method2(new byte[]{1, 2}, new byte[]{1}));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, new byte[]{1}));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, new byte[]{1}));
    }
}
