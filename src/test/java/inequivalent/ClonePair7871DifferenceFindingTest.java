package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7871DifferenceFindingTest {
    @Test
    void methodsValidateNameAndChecksumDifferently() {
        ClonePair7871 clonePair = new ClonePair7871();

        assertTrue(clonePair.method1("a", 1));
        assertFalse(clonePair.method2("a", 1));
    }
}
