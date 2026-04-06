package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5712DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5712 clonePair = new ClonePair5712();

        assertFalse(clonePair.method1("a", false));
        assertTrue(clonePair.method2("a", false));
    }
}
