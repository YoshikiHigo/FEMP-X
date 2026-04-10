package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair64NoDifferenceTest {

    private final ClonePair64 subject = new ClonePair64();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertNull(subject.method1(null, ","));
        assertNull(subject.method2(null, ","));

        assertNull(subject.method1(java.util.Collections.emptyList(), ","));
        assertNull(subject.method2(java.util.Collections.emptyList(), ","));

        assertEquals("a,b", subject.method1(java.util.Arrays.asList("a", "b"), ","));
        assertEquals("a,b", subject.method2(java.util.Arrays.asList("a", "b"), ","));

        assertEquals("null,b", subject.method1(java.util.Arrays.asList((String) null, "b"), ","));
        assertEquals("null,b", subject.method2(java.util.Arrays.asList((String) null, "b"), ","));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        java.util.List invalidList = java.util.Collections.singletonList(Integer.valueOf(1));
        assertThrowsByName("java.lang.ClassCastException", () -> subject.method1(invalidList, ","));
        assertThrowsByName("java.lang.ClassCastException", () -> subject.method2(invalidList, ","));
    }
}
