package equivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1546NoDifferenceTest {

    private final ClonePair1546 subject = new ClonePair1546();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertTrue(subject.method1(null, null));
        assertTrue(subject.method2(null, null));

        assertFalse(subject.method1(null, List.of("a")));
        assertFalse(subject.method2(null, List.of("a")));

        assertTrue(subject.method1(List.of("a", "b"), List.of("b", "a")));
        assertTrue(subject.method2(List.of("a", "b"), List.of("b", "a")));

        assertFalse(subject.method1(List.of("a"), List.of("b")));
        assertFalse(subject.method2(List.of("a"), List.of("b")));
    }
}
