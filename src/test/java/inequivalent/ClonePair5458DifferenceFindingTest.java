package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5458DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5458 clonePair = new ClonePair5458();
        int[][][] imageData = new int[4][4][4];
        imageData[0][0][1] = 1;

        assertEquals(1, clonePair.method1(imageData)[0][0][1]);
        assertEquals(-1, clonePair.method2(imageData)[0][0][1]);
    }
}
