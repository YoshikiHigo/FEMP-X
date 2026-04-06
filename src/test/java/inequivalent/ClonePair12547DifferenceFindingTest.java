package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12547DifferenceFindingTest {
    @Test
    void methodsHandleCenturyLeapYearDifferently() {
        ClonePair12547 clonePair = new ClonePair12547();

        assertTrue(clonePair.method1(1, 29, 1900));
        assertFalse(clonePair.method2(1, 29, 1900));
    }
}
