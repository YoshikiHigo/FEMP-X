package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6423DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6423 clonePair = new ClonePair6423();

        assertArrayEquals(new byte[]{0, 0}, clonePair.method1(new float[]{0.0f}, 0, 1, new byte[2], 0));
        assertArrayEquals(new byte[]{-1, 127}, clonePair.method2(new float[]{0.0f}, 0, 1, new byte[2], 0));
    }
}
