package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6350DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6350 clonePair = new ClonePair6350();

        assertTrue(clonePair.method1("ba", "a"));
        assertFalse(clonePair.method2("ba", "a"));
    }
}
