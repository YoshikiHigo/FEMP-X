package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11685DifferenceFindingTest {
    @Test
    void methodsCheckDifferentCharacterSets() {
        ClonePair11685 clonePair = new ClonePair11685();

        assertFalse(clonePair.method1(':'));
        assertTrue(clonePair.method2(':'));
    }
}
