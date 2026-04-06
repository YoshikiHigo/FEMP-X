package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12488DifferenceFindingTest {
    @Test
    void methodsAllowDifferentNumericCharacters() {
        ClonePair12488 clonePair = new ClonePair12488();

        assertFalse(clonePair.method1("."));
        assertTrue(clonePair.method2("."));
    }
}
