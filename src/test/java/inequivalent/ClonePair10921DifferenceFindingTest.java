package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10921DifferenceFindingTest {
    @Test
    void methodsCheckDifferentCharacterSets() {
        ClonePair10921 clonePair = new ClonePair10921();

        assertTrue(clonePair.method1('!'));
        assertFalse(clonePair.method2('!'));
    }
}
