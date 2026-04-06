package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5766DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5766 clonePair = new ClonePair5766();

        assertFalse(clonePair.method1(1500));
        assertTrue(clonePair.method2(1500));
    }
}
