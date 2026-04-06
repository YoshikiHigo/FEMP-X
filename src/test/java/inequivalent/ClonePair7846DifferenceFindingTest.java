package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7846DifferenceFindingTest {
    @Test
    void methodsHandleEvenBackslashRunsDifferently() {
        ClonePair7846 clonePair = new ClonePair7846();

        assertFalse(clonePair.method1("\\\\", 2));
        assertTrue(clonePair.method2("\\\\", 2));
    }
}
