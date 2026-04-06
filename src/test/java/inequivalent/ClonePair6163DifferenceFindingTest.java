package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6163DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6163 clonePair = new ClonePair6163();

        assertArrayEquals(new float[]{256.0f * (1.0f / 32767.0f)}, clonePair.method1(new byte[]{1, 0}, 0, new float[1], 0, 1), 0.0f);
        assertArrayEquals(new float[]{1.0f / 127.0f}, clonePair.method2(new byte[]{1, 0}, 0, new float[1], 0, 1), 0.0f);
    }
}
