package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair7891DifferenceFindingTest {
    @Test
    void methodsErodeAndDilateDifferently() {
        ClonePair7891 clonePair = new ClonePair7891();
        float[][] input = {{1.0f, 2.0f}};

        assertArrayEquals(new float[]{1.0f, 1.0f}, clonePair.method1(input, 1, false)[0]);
        assertArrayEquals(new float[]{2.0f, 2.0f}, clonePair.method2(input, 1, false)[0]);
    }
}
