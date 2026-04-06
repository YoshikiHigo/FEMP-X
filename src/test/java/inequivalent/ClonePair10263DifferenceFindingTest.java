package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10263DifferenceFindingTest {
    @Test
    void methodsTrimBooleanTextDifferently() {
        ClonePair10263 clonePair = new ClonePair10263();

        assertFalse(clonePair.method1(" true "));
        assertTrue(clonePair.method2(" true "));
    }
}
