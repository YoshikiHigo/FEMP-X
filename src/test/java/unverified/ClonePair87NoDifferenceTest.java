package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair87NoDifferenceTest {

    private final ClonePair87 subject = new ClonePair87();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        char[] source = {'a', 'b', 'c'};

        assertEquals(1, subject.method1(source, 0, 3, new char[]{'b'}, 0, 1, 0));
        assertEquals(1, subject.method2(source, 0, 3, new char[]{'b'}, 0, 1, 0));

        assertEquals(-1, subject.method1(source, 0, 3, new char[]{'B'}, 0, 1, 0));
        assertEquals(-1, subject.method2(source, 0, 3, new char[]{'B'}, 0, 1, 0));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(new char[]{'a'}, 0, 1, null, 0, 1, 0));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(new char[]{'a'}, 0, 1, null, 0, 1, 0));
    }
}
