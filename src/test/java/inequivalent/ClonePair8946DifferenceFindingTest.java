package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair8946DifferenceFindingTest {
    @Test
    void methodsComputeDifferentMatrixOperations() {
        ClonePair8946 clonePair = new ClonePair8946();
        int[][] left = {{1}};
        int[][] right = {{2}};

        assertArrayEquals(new int[][]{{3}}, clonePair.method1(left, right));
        assertArrayEquals(new int[][]{{1}}, clonePair.method2(left, right));
    }
}
