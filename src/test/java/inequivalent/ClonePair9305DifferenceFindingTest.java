package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9305DifferenceFindingTest {
    @Test
    void methodsTreatDotAfterPrefixDifferently() {
        ClonePair9305 clonePair = new ClonePair9305();

        assertFalse(clonePair.method1("a", "a.b"));
        assertTrue(clonePair.method2("a", "a.b"));
    }
}
