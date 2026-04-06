package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5689DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5689 clonePair = new ClonePair5689();

        assertTrue(clonePair.method1("abc", "b", false));
        assertFalse(clonePair.method2("abc", "b", false));
    }
}
