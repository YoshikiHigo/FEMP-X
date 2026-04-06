package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7559DifferenceFindingTest {
    @Test
    void methodsCompareDifferentClassesByToStringDifferently() {
        ClonePair7559 clonePair = new ClonePair7559();

        assertFalse(clonePair.method1(1, 1L));
        assertTrue(clonePair.method2(1, 1L));
    }
}
