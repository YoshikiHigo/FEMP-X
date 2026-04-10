package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair6NoDifferenceTest {

    private final ClonePair6 subject = new ClonePair6();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertNull(subject.method1(null));
        assertNull(subject.method2(null));

        assertNull(subject.method1(""));
        assertNull(subject.method2(""));

        assertNull(subject.method1("   "));
        assertNull(subject.method2("   "));

        assertEquals(Long.valueOf(42L), subject.method1("42"));
        assertEquals(Long.valueOf(42L), subject.method2("42"));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1(" 42 "));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2(" 42 "));

        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1("1(sec)"));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2("1(sec)"));
    }
}
