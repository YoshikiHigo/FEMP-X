package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6113DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6113 clonePair = new ClonePair6113();

        assertTrue(clonePair.method1(new Object[]{new String("a")}, new Object[]{new String("a")}));
        assertFalse(clonePair.method2(new Object[]{new String("a")}, new Object[]{new String("a")}));
    }
}
