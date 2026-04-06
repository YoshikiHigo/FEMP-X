package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6623DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6623 clonePair = new ClonePair6623();

        assertEquals(1.0, clonePair.method1(1.0, Integer.MIN_VALUE));
        assertTrue(Double.isNaN(clonePair.method2(1.0, Integer.MIN_VALUE)));
    }
}
