package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11337DifferenceFindingTest {
    @Test
    void methodsCheckDifferentCharacterRanges() {
        ClonePair11337 clonePair = new ClonePair11337();

        assertTrue(clonePair.method1((char) 0x7F));
        assertFalse(clonePair.method2((char) 0x7F));
    }
}
