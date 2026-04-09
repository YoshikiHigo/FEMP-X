package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair69NoDifferenceTest {

    private final ClonePair69 subject = new ClonePair69();

    @Test
    void noDifferenceFoundForRepresentativeReturnValuesAndSideEffects() {
        StringBuilder matching1 = new StringBuilder("prefixSuffix");
        StringBuilder matching2 = new StringBuilder("prefixSuffix");
        assertTrue(subject.method1(matching1, "Suffix"));
        assertTrue(subject.method2(matching2, "Suffix"));
        assertEquals("prefixSuffix", matching1.toString());
        assertEquals("prefixSuffix", matching2.toString());

        StringBuilder nonMatching1 = new StringBuilder("prefixSuffix");
        StringBuilder nonMatching2 = new StringBuilder("prefixSuffix");
        assertFalse(subject.method1(nonMatching1, "suffix"));
        assertFalse(subject.method2(nonMatching2, "suffix"));
        assertEquals("prefixSuffix", nonMatching1.toString());
        assertEquals("prefixSuffix", nonMatching2.toString());

        assertFalse(subject.method1(new StringBuilder("abc"), "abcd"));
        assertFalse(subject.method2(new StringBuilder("abc"), "abcd"));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, "a"));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, "a"));

        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(new StringBuilder("a"), null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(new StringBuilder("a"), null));
    }
}
