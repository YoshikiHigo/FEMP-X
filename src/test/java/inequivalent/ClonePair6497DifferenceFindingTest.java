package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6497DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6497 clonePair = new ClonePair6497();

        assertArrayEquals(new byte[]{127, -1, -1, -1}, clonePair.method1(new float[]{1.0f}, 0, 1, new byte[4], 0));
        assertArrayEquals(new byte[]{-1, 127, 0, 0}, clonePair.method2(new float[]{1.0f}, 0, 1, new byte[4], 0));
    }
}
