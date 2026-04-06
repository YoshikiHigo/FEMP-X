package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair7377DifferenceFindingTest {
    @Test
    void methodsApplyTranslationDifferently() {
        ClonePair7377 clonePair = new ClonePair7377();
        double[][] rotMatrix = {
                {1.0, 0.0, 0.0, 10.0},
                {0.0, 1.0, 0.0, 20.0},
                {0.0, 0.0, 1.0, 30.0}
        };
        double[][] coords = {{0.0, 0.0, 0.0}};

        assertArrayEquals(new double[]{0.0, 0.0, 0.0}, clonePair.method1(rotMatrix, coords)[0]);
        assertArrayEquals(new double[]{10.0, 20.0, 30.0}, clonePair.method2(rotMatrix, coords)[0]);
    }
}
