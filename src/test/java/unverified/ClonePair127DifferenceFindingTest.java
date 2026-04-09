package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair127DifferenceFindingTest {

    private final ClonePair127 subject = new ClonePair127();

    @Test
    void methodsPreserveFloatingPointPrecisionDifferently() {
        assertEquals((double) ((float) 0.1), subject.method1(0.1, 0.0, 1.0), 0.0);
        assertEquals(0.1, subject.method2(0.1, 0.0, 1.0), 0.0);
    }
}
