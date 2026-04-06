package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9050DifferenceFindingTest {
    @Test
    void methodsHandleCaseDifferently() {
        ClonePair9050 clonePair = new ClonePair9050();

        assertFalse(clonePair.method1(new char[]{'A', 'x'}, 0, 1, 'a', 'x'));
        assertTrue(clonePair.method2(new char[]{'A', 'x'}, 0, 1, 'a', 'x'));
    }
}
