package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5125DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5125 clonePair = new ClonePair5125();

        assertEquals(1, clonePair.method1(2, 1)[0][0]);
        assertEquals(-1, clonePair.method2(2, 1)[0][0]);
    }
}
