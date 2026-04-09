package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair131DifferenceFindingTest {

    private final ClonePair131 subject = new ClonePair131();

    @Test
    void methodsDisagreeForReversedBounds() {
        assertEquals(1.0, subject.method1(0.5, 1.0, 0.0), 0.0);
        assertEquals(0.0, subject.method2(0.5, 1.0, 0.0), 0.0);
    }
}
