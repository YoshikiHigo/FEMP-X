package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6170DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6170 clonePair = new ClonePair6170();

        assertArrayEquals(new float[]{(65536 - 0x7FFFFF) * (1.0f / (float) 0x7FFFFF)},
                clonePair.method1(new byte[]{1, 0, 0}, 0, new float[1], 0, 1), 0.0f);
        assertArrayEquals(new float[]{(1 - 0x7FFFFF) * (1.0f / (float) 0x7FFFFF)},
                clonePair.method2(new byte[]{1, 0, 0}, 0, new float[1], 0, 1), 0.0f);
    }
}
