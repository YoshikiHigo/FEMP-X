package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6540DifferenceFindingTest {
    @Test
    void onlyMethod1AllowsEqualMinimumAndMaximumDigitCounts() {
        ClonePair6540 clonePair = new ClonePair6540();

        assertTrue(clonePair.method1("1", 1, 1));
        assertFalse(clonePair.method2("1", 1, 1));
    }
}
