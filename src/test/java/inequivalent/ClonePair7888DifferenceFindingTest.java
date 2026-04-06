package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair7888DifferenceFindingTest {
    @Test
    void methodsReturnMaximumAndRangeDifferently() {
        ClonePair7888 clonePair = new ClonePair7888();
        double[][] input = {{1.0, 3.0}};

        assertArrayEquals(new double[]{3.0}, clonePair.method1(input));
        assertArrayEquals(new double[]{2.0}, clonePair.method2(input));
    }
}
