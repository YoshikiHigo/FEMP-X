package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10996DifferenceFindingTest {
    @Test
    void methodsCheckDifferentColumnSets() {
        ClonePair10996 clonePair = new ClonePair10996();

        assertFalse(clonePair.method1(0, 2));
        assertTrue(clonePair.method2(0, 2));
    }
}
