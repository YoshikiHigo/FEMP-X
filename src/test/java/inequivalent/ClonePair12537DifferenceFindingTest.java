package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12537DifferenceFindingTest {
    @Test
    void methodsCheckDifferentFloatConditions() {
        ClonePair12537 clonePair = new ClonePair12537();

        assertTrue(clonePair.method1(Float.MIN_VALUE));
        assertFalse(clonePair.method2(Float.MIN_VALUE));
    }
}
