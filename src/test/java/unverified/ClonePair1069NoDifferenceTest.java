package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair1069NoDifferenceTest {

    private final ClonePair1069 subject = new ClonePair1069();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        Object[] empty = {};
        assertEquals(-1, subject.method1(empty, 1));
        assertEquals(-1, subject.method2(empty, 1));

        Object[] sorted = {1, 3, 5};
        Object[] original = sorted.clone();
        assertEquals(1, subject.method1(sorted, 3));
        assertArrayEquals(original, sorted);
        assertEquals(1, subject.method2(sorted, 3));
        assertArrayEquals(original, sorted);

        assertEquals(-3, subject.method1(sorted, 4));
        assertEquals(-3, subject.method2(sorted, 4));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 1));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 1));

        Object[] sorted = {1, 3, 5};
        assertThrowsByName("java.lang.ClassCastException", () -> subject.method1(sorted, "x"));
        assertThrowsByName("java.lang.ClassCastException", () -> subject.method2(sorted, "x"));
    }
}
