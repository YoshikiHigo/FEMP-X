package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair106DifferenceFindingTest {

    private final ClonePair106 subject = new ClonePair106();

    @Test
    void methodsDisagreeForReversedBounds() {
        assertEquals(1.0, subject.method1(0.5, 1.0, 0.0), 0.0);
        assertEquals(0.0, subject.method2(0.5, 1.0, 0.0), 0.0);
    }
}
