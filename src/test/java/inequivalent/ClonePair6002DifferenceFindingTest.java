package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6002DifferenceFindingTest {
    @Test
    void methodsClampValuesBelowLowerBoundDifferently() {
        ClonePair6002 clonePair = new ClonePair6002();
        int[][] matrix = {{0}};

        assertArrayEquals(new int[][]{{Integer.MAX_VALUE}}, clonePair.method1(matrix, 1, 2));
        assertArrayEquals(new int[][]{{1}}, clonePair.method2(matrix, 1, 2));
    }
}
