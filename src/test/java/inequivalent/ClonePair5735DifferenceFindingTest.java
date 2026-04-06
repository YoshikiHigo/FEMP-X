package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5735DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5735 clonePair = new ClonePair5735();

        assertFalse(clonePair.method1("010", false));
        assertTrue(clonePair.method2("010", false));
    }
}
