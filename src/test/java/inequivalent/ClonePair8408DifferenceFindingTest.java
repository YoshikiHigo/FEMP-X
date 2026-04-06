package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair8408DifferenceFindingTest {
    @Test
    void methodsFillShiftedPositionDifferently() {
        ClonePair8408 clonePair = new ClonePair8408();
        int[] input = {1, 2, 3};

        assertArrayEquals(new int[]{0, 0, 0}, clonePair.method1(input, 0, 0, 1));
        assertArrayEquals(new int[]{0, 3, 0}, clonePair.method2(input, 0, 0, 1));
    }
}
