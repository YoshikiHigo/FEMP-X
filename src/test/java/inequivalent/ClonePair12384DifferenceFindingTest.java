package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12384DifferenceFindingTest {
    @Test
    void methodsHandleTrailingBackslashDifferently() {
        ClonePair12384 clonePair = new ClonePair12384();

        assertFalse(clonePair.method1("a\\"));
        assertTrue(clonePair.method2("a\\"));
    }
}
