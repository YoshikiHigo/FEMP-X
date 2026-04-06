package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8313DifferenceFindingTest {
    @Test
    void methodsApplyPermutationToDifferentSides() {
        ClonePair8313 clonePair = new ClonePair8313();
        int[] permutation = {2, 0, 1};
        double[] values = {10.0, 20.0, 30.0};
        double[] method1Output = new double[3];
        double[] method2Output = new double[3];

        assertTrue(clonePair.method1(permutation, values, method1Output, 3));
        assertTrue(clonePair.method2(permutation, values, method2Output, 3));
        assertArrayEquals(new double[]{20.0, 30.0, 10.0}, method1Output);
        assertArrayEquals(new double[]{30.0, 10.0, 20.0}, method2Output);
    }
}
