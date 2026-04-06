package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6003DifferenceFindingTest {
    @Test
    void methodsFlipMatrixInDifferentDirections() {
        ClonePair6003 clonePair = new ClonePair6003();
        int[][] matrix = {{1, 2}, {3, 4}};

        assertArrayEquals(new int[][]{{3, 4}, {1, 2}}, clonePair.method1(matrix, 2, 2));
        assertArrayEquals(new int[][]{{2, 1}, {4, 3}}, clonePair.method2(matrix, 2, 2));
    }
}
