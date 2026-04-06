package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6905DifferenceFindingTest {
    @Test
    void methodsSumDifferentMatrixDirections() {
        ClonePair6905 clonePair = new ClonePair6905();
        double[][] values = {{1.0, 2.0}, {3.0, 4.0}};

        assertArrayEquals(new double[]{1.0, 2.0}, clonePair.method1(values, 2, 0, 0));
        assertArrayEquals(new double[]{1.0, 3.0}, clonePair.method2(values, 2, 0, 0));
    }
}
