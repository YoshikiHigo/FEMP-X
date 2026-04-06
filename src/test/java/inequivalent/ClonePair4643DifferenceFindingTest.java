package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4643DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4643 clonePair = new ClonePair4643();

        double[] values = {1.0, 1.0e16};

        assertEquals(5.0e15, clonePair.method1(values));
        assertEquals(5.000000000000001e15, clonePair.method2(values));
    }
}
