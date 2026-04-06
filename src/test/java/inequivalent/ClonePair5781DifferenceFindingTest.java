package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5781DifferenceFindingTest {
    @Test
    void methodsCheckDifferentNumericProperties() {
        ClonePair5781 clonePair = new ClonePair5781();

        assertTrue(clonePair.method1(2));
        assertFalse(clonePair.method2(2));
    }
}
