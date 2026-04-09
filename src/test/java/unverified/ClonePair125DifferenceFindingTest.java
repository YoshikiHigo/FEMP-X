package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair125DifferenceFindingTest {

    private final ClonePair125 subject = new ClonePair125();

    @Test
    void methodsPreserveFloatingPointPrecisionDifferently() {
        assertEquals((double) ((float) 0.1), subject.method1(0.1, 0.0, 1.0), 0.0);
        assertEquals(0.1, subject.method2(0.1, 0.0, 1.0), 0.0);
    }
}
