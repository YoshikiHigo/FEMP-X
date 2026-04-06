package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6121DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6121 clonePair = new ClonePair6121();

        assertArrayEquals(new float[]{-1.0f}, clonePair.method1(new byte[]{0, 0, 0, 0}, 0, new float[1], 0, 1), 0.0f);
        assertArrayEquals(new float[]{0.0f}, clonePair.method2(new byte[]{0, 0, 0, 0}, 0, new float[1], 0, 1), 0.0f);
    }
}
