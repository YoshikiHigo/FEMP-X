package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5253DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5253 clonePair = new ClonePair5253();

        assertTrue(clonePair.method1(1700));
        assertFalse(clonePair.method2(1700));
    }
}
