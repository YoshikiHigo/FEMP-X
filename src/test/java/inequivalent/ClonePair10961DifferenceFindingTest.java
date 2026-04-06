package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10961DifferenceFindingTest {
    @Test
    void methodsCheckDifferentCharacterSets() {
        ClonePair10961 clonePair = new ClonePair10961();

        assertFalse(clonePair.method1('@'));
        assertTrue(clonePair.method2('@'));
    }
}
