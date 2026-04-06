package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8902DifferenceFindingTest {
    @Test
    void methodsCheckNumericBoundariesDifferently() {
        ClonePair8902 clonePair = new ClonePair8902();

        assertFalse(clonePair.method1("1", "12"));
        assertTrue(clonePair.method2("1", "12"));
    }
}
