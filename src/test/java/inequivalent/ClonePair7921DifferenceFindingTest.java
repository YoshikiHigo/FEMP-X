package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7921DifferenceFindingTest {
    @Test
    void methodsMutateTriangleBufferDifferently() {
        ClonePair7921 clonePair = new ClonePair7921();
        int[] method1Buffer = new int[6];
        int[] method2Buffer = new int[6];
        int[] vertices = {0, 1, 2, 3};
        int[] stripCounts = {4};

        assertEquals(2, clonePair.method1(0, method1Buffer, 0, vertices, 0, stripCounts, 1));
        assertEquals(2, clonePair.method2(0, method2Buffer, 0, vertices, 0, stripCounts, 1));
        assertArrayEquals(new int[]{0, 1, 2, 2, 1, 3}, method1Buffer);
        assertArrayEquals(new int[]{0, 1, 2, 0, 2, 3}, method2Buffer);
    }
}
