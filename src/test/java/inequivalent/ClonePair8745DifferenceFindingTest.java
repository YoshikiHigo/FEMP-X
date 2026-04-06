package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8745DifferenceFindingTest {
    @Test
    void methodsHandleCaseDifferently() {
        ClonePair8745 clonePair = new ClonePair8745();

        assertTrue(clonePair.method1("a", "A"));
        assertFalse(clonePair.method2("a", "A"));
    }
}
