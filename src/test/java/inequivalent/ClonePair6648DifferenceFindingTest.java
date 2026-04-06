package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6648DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6648 clonePair = new ClonePair6648();

        assertFalse(clonePair.method1(new Object[]{new String("a")}, new String("a"), 1));
        assertTrue(clonePair.method2(new Object[]{new String("a")}, new String("a"), 1));
    }
}
