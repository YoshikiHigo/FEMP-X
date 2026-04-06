package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5921DifferenceFindingTest {
    @Test
    void methodsCheckDifferentStringProperties() {
        ClonePair5921 clonePair = new ClonePair5921();

        assertTrue(clonePair.method1("ab", "a"));
        assertFalse(clonePair.method2("ab", "a"));
    }
}
