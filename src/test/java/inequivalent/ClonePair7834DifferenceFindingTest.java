package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7834DifferenceFindingTest {
    @Test
    void methodsFallBackToToStringDifferently() {
        ClonePair7834 clonePair = new ClonePair7834();

        assertFalse(clonePair.method1(1, 1L));
        assertTrue(clonePair.method2(1, 1L));
    }
}
