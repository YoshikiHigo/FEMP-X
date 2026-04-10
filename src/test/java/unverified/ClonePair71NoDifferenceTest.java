package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair71NoDifferenceTest {

    private final ClonePair71 subject = new ClonePair71();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertTrue(subject.method1(new StringBuilder("foobar"), "bar"));
        assertTrue(subject.method2(new StringBuilder("foobar"), "bar"));

        assertFalse(subject.method1(new StringBuilder("foobar"), "baz"));
        assertFalse(subject.method2(new StringBuilder("foobar"), "baz"));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(new StringBuilder("abc"), null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(new StringBuilder("abc"), null));
    }
}
