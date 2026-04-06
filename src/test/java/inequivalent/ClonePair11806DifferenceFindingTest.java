package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11806DifferenceFindingTest {
    @Test
    void methodsHandleNonAsciiLettersDifferently() {
        ClonePair11806 clonePair = new ClonePair11806();

        assertFalse(clonePair.method1('\u00E9'));
        assertTrue(clonePair.method2('\u00E9'));
    }
}
