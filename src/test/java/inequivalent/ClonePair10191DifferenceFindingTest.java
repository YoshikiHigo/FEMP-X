package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10191DifferenceFindingTest {
    @Test
    void methodsHandleFullWidthLettersDifferently() {
        ClonePair10191 clonePair = new ClonePair10191();

        assertTrue(clonePair.method1('\uFF21'));
        assertFalse(clonePair.method2('\uFF21'));
    }
}
