package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair37NoDifferenceTest {

    private final ClonePair37 subject = new ClonePair37();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertNull(subject.method1(null));
        assertNull(subject.method2(null));

        assertEquals(Long.valueOf(42L), subject.method1("42"));
        assertEquals(Long.valueOf(42L), subject.method2("42"));

        assertEquals(Long.valueOf(10L), subject.method1("010"));
        assertEquals(Long.valueOf(10L), subject.method2("010"));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1(""));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2(""));

        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1("bad"));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2("bad"));

        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1(" 42 "));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2(" 42 "));
    }
}
