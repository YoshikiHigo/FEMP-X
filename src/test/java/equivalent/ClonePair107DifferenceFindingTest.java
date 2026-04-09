package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair107DifferenceFindingTest {

    private final ClonePair107 subject = new ClonePair107();

    @Test
    void methodsTreatSignedZeroDifferently() {
        assertEquals(Double.doubleToLongBits(-0.0), Double.doubleToLongBits(subject.method1(-0.0, 0.0, 0.0)));
        assertEquals(Double.doubleToLongBits(0.0), Double.doubleToLongBits(subject.method2(-0.0, 0.0, 0.0)));
    }
}
