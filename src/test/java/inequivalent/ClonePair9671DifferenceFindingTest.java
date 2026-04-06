package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9671DifferenceFindingTest {
    @Test
    void methodsInterpretBoundsDifferently() {
        ClonePair9671 clonePair = new ClonePair9671();

        assertFalse(clonePair.method1(10, 20, 5));
        assertTrue(clonePair.method2(10, 20, 5));
    }
}
