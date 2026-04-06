package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12582DifferenceFindingTest {
    @Test
    void methodsInterpretArgumentsAsDifferentRanges() {
        ClonePair12582 clonePair = new ClonePair12582();

        assertFalse(clonePair.method1(-2, -2, 1));
        assertTrue(clonePair.method2(-2, -2, 1));
    }
}
