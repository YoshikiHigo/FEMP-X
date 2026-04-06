package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair8585DifferenceFindingTest {
    @Test
    void methodsInterpretLinearArrayOrderDifferently() {
        ClonePair8585 clonePair = new ClonePair8585();
        int[] input = {1, 2, 3, 4};

        assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, clonePair.method1(input, 2, 2));
        assertArrayEquals(new int[][]{{1, 3}, {2, 4}}, clonePair.method2(input, 2, 2));
    }
}
