package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair61NoDifferenceTest {

    private final ClonePair61 subject = new ClonePair61();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals("", subject.method1(java.util.Collections.emptyList(), ","));
        assertEquals("", subject.method2(java.util.Collections.emptyList(), ","));

        assertEquals("a,b", subject.method1(java.util.Arrays.asList("a", "b"), ","));
        assertEquals("a,b", subject.method2(java.util.Arrays.asList("a", "b"), ","));

        assertEquals("null,b", subject.method1(java.util.Arrays.asList((String) null, "b"), ","));
        assertEquals("null,b", subject.method2(java.util.Arrays.asList((String) null, "b"), ","));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, ","));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, ","));
    }
}
