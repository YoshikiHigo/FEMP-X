package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair77NoDifferenceTest {

    private final ClonePair77 subject = new ClonePair77();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        char[] input = {'a', 'b', 'c'};

        assertEquals(1, subject.method1(input, 'b', 0));
        assertEquals(1, subject.method2(input, 'b', 0));

        assertEquals(-1, subject.method1(input, 'z', 0));
        assertEquals(-1, subject.method2(input, 'z', 0));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 'a', 0));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 'a', 0));
    }
}
