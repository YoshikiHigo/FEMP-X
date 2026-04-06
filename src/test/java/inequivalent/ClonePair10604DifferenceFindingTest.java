package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10604DifferenceFindingTest {
    @Test
    void methodsHandleSignedZeroDifferently() {
        ClonePair10604 clonePair = new ClonePair10604();
        double[] values = {-0.0, 0.0};

        assertEquals(Double.doubleToLongBits(-0.0), Double.doubleToLongBits(clonePair.method1(values)));
        assertEquals(Double.doubleToLongBits(0.0), Double.doubleToLongBits(clonePair.method2(values)));
    }
}
