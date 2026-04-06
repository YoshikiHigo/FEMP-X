package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5572DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5572 clonePair = new ClonePair5572();

        assertTrue(clonePair.method1("\t", true));
        assertFalse(clonePair.method2("\t", true));
    }
}
