package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12642DifferenceFindingTest {
    @Test
    void onlyMethod1TrimsBeforeComparing() {
        ClonePair12642 clonePair = new ClonePair12642();
        String[] searchIn = {"a"};

        assertTrue(clonePair.method1(" a ", searchIn));
        assertFalse(clonePair.method2(" a ", searchIn));
    }
}
