package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair81NoDifferenceTest {

    private final ClonePair81 subject = new ClonePair81();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        char[] source = {'a', 'b', 'c'};

        assertEquals(0, subject.method1(source, 0, 3, new char[]{'A'}, 0, 1, 0));
        assertEquals(0, subject.method2(source, 0, 3, new char[]{'A'}, 0, 1, 0));

        assertEquals(-1, subject.method1(source, 0, 3, new char[]{'z'}, 0, 1, 0));
        assertEquals(-1, subject.method2(source, 0, 3, new char[]{'z'}, 0, 1, 0));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(new char[]{'a'}, 0, 1, null, 0, 1, 0));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(new char[]{'a'}, 0, 1, null, 0, 1, 0));
    }
}
