package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6084DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6084 clonePair = new ClonePair6084();

        assertFalse(clonePair.method1(new Object[]{1, 2}, new Object[]{2, 1}));
        assertTrue(clonePair.method2(new Object[]{1, 2}, new Object[]{2, 1}));
    }
}
