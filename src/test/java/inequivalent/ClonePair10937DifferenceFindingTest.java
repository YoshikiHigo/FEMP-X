package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10937DifferenceFindingTest {
    @Test
    void methodsInterpretBooleanCaseFlagDifferently() {
        ClonePair10937 clonePair = new ClonePair10937();

        assertTrue(clonePair.method1('a', 'A', true));
        assertFalse(clonePair.method2('a', 'A', true));
    }
}
