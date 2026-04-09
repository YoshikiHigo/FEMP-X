package equivalent;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair99NoDifferenceTest {

    private final ClonePair99 subject = new ClonePair99();

    @Test
    void noDifferenceFoundForRepresentativeReturnValuesAndSideEffects() {
        List<String> missing1 = new ArrayList<>(List.of("a"));
        List<String> missing2 = new ArrayList<>(List.of("a"));
        assertTrue(subject.method1(missing1, "b"));
        assertTrue(subject.method2(missing2, "b"));
        assertEquals(List.of("a", "b"), missing1);
        assertEquals(List.of("a", "b"), missing2);

        List<String> present1 = new ArrayList<>(List.of("a"));
        List<String> present2 = new ArrayList<>(List.of("a"));
        assertFalse(subject.method1(present1, "a"));
        assertFalse(subject.method2(present2, "a"));
        assertEquals(List.of("a"), present1);
        assertEquals(List.of("a"), present2);

        List<String> nullElement1 = new ArrayList<>();
        List<String> nullElement2 = new ArrayList<>();
        assertTrue(subject.method1(nullElement1, null));
        assertTrue(subject.method2(nullElement2, null));
        assertEquals(Collections.singletonList(null), nullElement1);
        assertEquals(Collections.singletonList(null), nullElement2);
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertFalse(subject.method1(null, "a"));
        assertFalse(subject.method2(null, "a"));

        assertThrowsByName("java.lang.UnsupportedOperationException", () -> subject.method1(List.of("a"), "b"));
        assertThrowsByName("java.lang.UnsupportedOperationException", () -> subject.method2(List.of("a"), "b"));
    }
}
