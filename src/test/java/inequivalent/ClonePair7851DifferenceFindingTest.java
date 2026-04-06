package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7851DifferenceFindingTest {
    @Test
    void methodsHandleCaseDifferently() {
        ClonePair7851 clonePair = new ClonePair7851();

        assertFalse(clonePair.method1("a", "A"));
        assertTrue(clonePair.method2("a", "A"));
    }
}
