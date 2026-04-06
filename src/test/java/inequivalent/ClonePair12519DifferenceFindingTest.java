package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair12519DifferenceFindingTest {
    @Test
    void methodsFillMatrixInDifferentOrders() {
        ClonePair12519 clonePair = new ClonePair12519();
        double[] values = {1.0, 2.0, 3.0, 4.0};

        assertArrayEquals(new double[][]{{1.0, 3.0}, {2.0, 4.0}}, clonePair.method1(values, 2, 2));
        assertArrayEquals(new double[][]{{1.0, 2.0}, {3.0, 4.0}}, clonePair.method2(values, 2, 2));
    }
}
