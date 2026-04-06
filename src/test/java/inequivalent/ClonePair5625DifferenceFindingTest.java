package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5625DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5625 clonePair = new ClonePair5625();

        assertFalse(clonePair.method1("010", false));
        assertTrue(clonePair.method2("010", false));
    }
}
