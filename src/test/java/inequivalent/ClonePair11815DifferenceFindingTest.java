package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11815DifferenceFindingTest {
    @Test
    void methodsHandleMultipleSpacesDifferently() {
        ClonePair11815 clonePair = new ClonePair11815();

        assertTrue(clonePair.method1("  "));
        assertFalse(clonePair.method2("  "));
    }
}
