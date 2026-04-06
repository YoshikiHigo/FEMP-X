package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair116DifferenceFindingTest {

    private final ClonePair116 subject = new ClonePair116();

    @Test
    void methodsTreatLowerBoundDifferently() {
        assertEquals(1.0, subject.method1(-1.0, -1.0, 0.5));
        assertEquals(0.0, subject.method2(-1.0, -1.0, 0.5));
    }
}
