package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5881DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5881 clonePair = new ClonePair5881();

        assertEquals(-1, clonePair.method1(new int[]{Integer.MIN_VALUE}, 1, 0, 0));
        assertEquals(-2, clonePair.method2(new int[]{Integer.MIN_VALUE}, 1, 0, 0));
    }
}
