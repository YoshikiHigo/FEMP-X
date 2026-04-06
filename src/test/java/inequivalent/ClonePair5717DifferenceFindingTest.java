package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5717DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5717 clonePair = new ClonePair5717();

        assertTrue(clonePair.method1("A", "a", true));
        assertFalse(clonePair.method2("A", "a", true));
    }
}
