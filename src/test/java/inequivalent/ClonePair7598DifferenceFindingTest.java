package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7598DifferenceFindingTest {
    @Test
    void methodsHandleBothNullDifferently() {
        ClonePair7598 clonePair = new ClonePair7598();

        assertFalse(clonePair.method1(null, null));
        assertTrue(clonePair.method2(null, null));
    }
}
