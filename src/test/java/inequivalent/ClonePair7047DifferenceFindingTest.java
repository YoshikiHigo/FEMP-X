package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7047DifferenceFindingTest {
    @Test
    void methodsTreatTrimmedWhitespaceDifferently() {
        ClonePair7047 clonePair = new ClonePair7047();

        assertTrue(clonePair.method1(" a", "a"));
        assertFalse(clonePair.method2(" a", "a"));
    }
}
