package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10666DifferenceFindingTest {
    @Test
    void methodsHandleSignedZeroDifferently() {
        ClonePair10666 clonePair = new ClonePair10666();
        double[] values = {0.0, -0.0};

        assertEquals(Double.doubleToLongBits(-0.0), Double.doubleToLongBits(clonePair.method1(values)));
        assertEquals(Double.doubleToLongBits(0.0), Double.doubleToLongBits(clonePair.method2(values)));
    }
}
