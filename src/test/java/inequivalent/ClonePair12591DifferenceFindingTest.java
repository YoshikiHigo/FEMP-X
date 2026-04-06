package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12591DifferenceFindingTest {
    @Test
    void methodsHandleZeroIncrementAtEqualBoundsDifferently() {
        ClonePair12591 clonePair = new ClonePair12591();

        assertFalse(clonePair.method1(0, 0, 0));
        assertTrue(clonePair.method2(0, 0, 0));
    }
}
