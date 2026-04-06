package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair7785DifferenceFindingTest {
    @Test
    void methodsDecodeTheSameBitsAsLongsAndDoubles() {
        ClonePair7785 clonePair = new ClonePair7785();
        byte[] input = {0, 0, 0, 0, 0, 0, 0, 1};

        assertArrayEquals(new long[]{1L}, (long[]) clonePair.method1(input));
        assertArrayEquals(new double[]{Double.longBitsToDouble(1L)}, (double[]) clonePair.method2(input));
    }
}
