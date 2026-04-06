package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5662DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5662 clonePair = new ClonePair5662();

        assertFalse(clonePair.method1("b", "abc", true));
        assertTrue(clonePair.method2("b", "abc", true));
    }
}
