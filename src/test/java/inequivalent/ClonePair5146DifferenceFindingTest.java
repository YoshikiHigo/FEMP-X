package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5146DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5146 clonePair = new ClonePair5146();

        double[] left = {1.0, 2.0, 3.0};
        double[] right = {4.0, 5.0, 6.0};

        assertTrue(clonePair.method1(left, right));
        assertFalse(clonePair.method2(left, right));
    }
}
