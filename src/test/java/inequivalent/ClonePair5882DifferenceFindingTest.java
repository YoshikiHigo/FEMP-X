package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5882DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5882 clonePair = new ClonePair5882();

        assertTrue(clonePair.method1(1500));
        assertFalse(clonePair.method2(1500));
    }
}
