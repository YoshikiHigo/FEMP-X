package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5071DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5071 clonePair = new ClonePair5071();

        assertTrue(clonePair.method1(1500));
        assertFalse(clonePair.method2(1500));
    }
}
