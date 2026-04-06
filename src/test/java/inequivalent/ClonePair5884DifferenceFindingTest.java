package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5884DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5884 clonePair = new ClonePair5884();

        assertFalse(clonePair.method1("1", "1.0"));
        assertTrue(clonePair.method2("1", "1.0"));
    }
}
