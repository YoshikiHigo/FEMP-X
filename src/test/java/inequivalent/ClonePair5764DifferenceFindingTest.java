package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5764DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5764 clonePair = new ClonePair5764();

        assertFalse(clonePair.method1(new StringBuffer("A"), 0, "a"));
        assertTrue(clonePair.method2(new StringBuffer("A"), 0, "a"));
    }
}
