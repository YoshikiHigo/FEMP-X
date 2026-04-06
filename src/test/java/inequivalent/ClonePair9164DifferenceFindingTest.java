package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9164DifferenceFindingTest {
    @Test
    void methodsHandleCaseDifferently() {
        ClonePair9164 clonePair = new ClonePair9164();

        assertTrue(clonePair.method1("A", "a"));
        assertFalse(clonePair.method2("A", "a"));
    }
}
