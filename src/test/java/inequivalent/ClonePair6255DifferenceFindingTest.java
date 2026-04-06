package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6255DifferenceFindingTest {
    @Test
    void methodsCombineMatricesDifferently() {
        ClonePair6255 clonePair = new ClonePair6255();
        double[][] first = {{2.0}};
        double[][] second = {{3.0}};

        assertArrayEquals(new double[][]{{6.0}}, clonePair.method1(first, second, 1, 1));
        assertArrayEquals(new double[][]{{5.0}}, clonePair.method2(first, second, 1, 1));
    }
}
