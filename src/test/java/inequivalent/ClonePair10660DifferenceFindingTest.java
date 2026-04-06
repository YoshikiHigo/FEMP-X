package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10660DifferenceFindingTest {
    @Test
    void methodsHandleNonAsciiDigitsDifferently() {
        ClonePair10660 clonePair = new ClonePair10660();

        assertTrue(clonePair.method1('\u0660'));
        assertFalse(clonePair.method2('\u0660'));
    }
}
