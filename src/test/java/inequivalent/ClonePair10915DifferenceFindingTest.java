package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10915DifferenceFindingTest {
    @Test
    void methodsHandleUppercaseLettersDifferently() {
        ClonePair10915 clonePair = new ClonePair10915();

        assertTrue(clonePair.method1("A"));
        assertFalse(clonePair.method2("A"));
    }
}
