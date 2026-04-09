package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair1061NoDifferenceTest {

    private final ClonePair1061 subject = new ClonePair1061();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        Object[] values = {null, "a", "b"};
        Object[] original = values.clone();

        assertEquals(0, subject.method1(values, null));
        assertArrayEquals(original, values);
        assertEquals(0, subject.method2(values, null));
        assertArrayEquals(original, values);

        assertEquals(2, subject.method1(values, "b"));
        assertEquals(2, subject.method2(values, "b"));

        assertEquals(-1, subject.method1(values, "c"));
        assertEquals(-1, subject.method2(values, "c"));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, "a"));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, "a"));
    }
}
