package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5170DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5170 clonePair = new ClonePair5170();

        double[] left = {1.0};
        double[] right = {1.0 + 1.0e-8};

        assertTrue(clonePair.method1(left, right));
        assertFalse(clonePair.method2(left, right));
    }
}
