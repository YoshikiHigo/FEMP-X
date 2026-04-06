package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7204DifferenceFindingTest {
    @Test
    void methodsTreatFirstCharacterCaseDifferently() {
        ClonePair7204 clonePair = new ClonePair7204();

        assertTrue(clonePair.method1("abc", "Abc"));
        assertFalse(clonePair.method2("abc", "Abc"));
    }
}
