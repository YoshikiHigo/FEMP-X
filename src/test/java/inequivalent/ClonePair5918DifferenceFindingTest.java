package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5918DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5918 clonePair = new ClonePair5918();

        assertTrue(clonePair.method1("X", "a"));
        assertFalse(clonePair.method2("X", "a"));
    }
}
