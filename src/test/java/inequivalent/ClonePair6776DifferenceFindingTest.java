package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6776DifferenceFindingTest {
    @Test
    void onlyMethod1UsesAbsoluteToleranceForNonZeroValues() {
        ClonePair6776 clonePair = new ClonePair6776();

        assertTrue(clonePair.method1(1.0e-9, 1.01e-8));
        assertFalse(clonePair.method2(1.0e-9, 1.01e-8));
    }
}
