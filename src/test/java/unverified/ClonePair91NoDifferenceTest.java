package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair91NoDifferenceTest {

    private final ClonePair91 subject = new ClonePair91();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertTrue(subject.method1(new char[]{'\f', '\r'}, 0, 2));
        assertTrue(subject.method2(new char[]{'\f', '\r'}, 0, 2));

        assertFalse(subject.method1(new char[]{'x'}, 0, 1));
        assertFalse(subject.method2(new char[]{'x'}, 0, 1));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 0, 1));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 0, 1));
    }
}
