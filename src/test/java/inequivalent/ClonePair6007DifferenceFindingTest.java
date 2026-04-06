package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6007DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6007 clonePair = new ClonePair6007();

        assertTrue(clonePair.method1(new Object[]{1, 2}, new Object[]{2, 1}));
        assertFalse(clonePair.method2(new Object[]{1, 2}, new Object[]{2, 1}));
    }
}
