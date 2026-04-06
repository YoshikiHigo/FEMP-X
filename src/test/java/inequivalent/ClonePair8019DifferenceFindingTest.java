package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8019DifferenceFindingTest {
    @Test
    void methodsHandleUnderscoresDifferently() {
        ClonePair8019 clonePair = new ClonePair8019();

        assertTrue(clonePair.method1("a_b", "a b"));
        assertFalse(clonePair.method2("a_b", "a b"));
    }
}
