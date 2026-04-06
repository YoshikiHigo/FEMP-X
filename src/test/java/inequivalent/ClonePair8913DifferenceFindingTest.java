package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair8913DifferenceFindingTest {
    @Test
    void methodsTakeTailAndHeadDifferently() {
        ClonePair8913 clonePair = new ClonePair8913();
        byte[] input = {1, 2};

        assertArrayEquals(new byte[]{2}, clonePair.method1(input, 1));
        assertArrayEquals(new byte[]{1}, clonePair.method2(input, 1));
    }
}
