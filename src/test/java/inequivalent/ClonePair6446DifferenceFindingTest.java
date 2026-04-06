package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6446DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6446 clonePair = new ClonePair6446();

        assertArrayEquals(new byte[]{-1, -1, -1, 127}, clonePair.method1(new float[]{1.0f}, 0, 1, new byte[4], 0));
        assertArrayEquals(new byte[]{-1, -1, 127, 0}, clonePair.method2(new float[]{1.0f}, 0, 1, new byte[4], 0));
    }
}
