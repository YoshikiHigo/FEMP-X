package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11420DifferenceFindingTest {
    @Test
    void methodsHandleNonAsciiIdentifierCharactersDifferently() {
        ClonePair11420 clonePair = new ClonePair11420();

        assertTrue(clonePair.method1('\u0100'));
        assertFalse(clonePair.method2('\u0100'));
    }
}
