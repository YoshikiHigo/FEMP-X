package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1521DifferenceFindingTest {

    private final ClonePair1521 subject = new ClonePair1521();

    @Test
    void methodsTreatPartialOverlapDifferently() {
        assertFalse(subject.method1(List.of("a", "b"), List.of("b", "c")));
        assertTrue(subject.method2(List.of("a", "b"), List.of("b", "c")));
    }
}
