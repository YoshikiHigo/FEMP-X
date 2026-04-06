package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12829DifferenceFindingTest {
    @Test
    void methodsValidateDifferentStringRules() {
        ClonePair12829 clonePair = new ClonePair12829();

        assertTrue(clonePair.method1("a"));
        assertFalse(clonePair.method2("a"));
    }
}
