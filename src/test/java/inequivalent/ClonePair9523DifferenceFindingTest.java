package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9523DifferenceFindingTest {
    @Test
    void methodsCheckDifferentArrayProperties() {
        ClonePair9523 clonePair = new ClonePair9523();
        int[] values = {2, 1};

        assertTrue(clonePair.method1(values));
        assertFalse(clonePair.method2(values));
    }
}
