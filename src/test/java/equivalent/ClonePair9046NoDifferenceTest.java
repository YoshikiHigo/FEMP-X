package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair9046NoDifferenceTest {

    private final ClonePair9046 subject = new ClonePair9046();

    @Test
    void nullArrayCandidateStillThrowsInBothMethods() {
        assertThrows(NullPointerException.class, () -> subject.method1(null, 3, null, -1, 0));
        assertThrows(NullPointerException.class, () -> subject.method2(null, 3, null, -1, 0));
    }
}
