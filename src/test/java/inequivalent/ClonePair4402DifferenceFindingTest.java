package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4402DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4402 clonePair = new ClonePair4402();

        assertEquals(Double.doubleToLongBits(-0.0), Double.doubleToLongBits(clonePair.method1(0.0, 0.0)));
        assertEquals(Double.doubleToLongBits(0.0), Double.doubleToLongBits(clonePair.method2(0.0, 0.0)));
    }
}
