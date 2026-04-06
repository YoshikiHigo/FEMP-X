package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10398DifferenceFindingTest {
    @Test
    void methodsCompareWithDifferentCaseSensitivity() {
        ClonePair10398 clonePair = new ClonePair10398();

        assertFalse(clonePair.method1("a", "A"));
        assertTrue(clonePair.method2("a", "A"));
    }
}
