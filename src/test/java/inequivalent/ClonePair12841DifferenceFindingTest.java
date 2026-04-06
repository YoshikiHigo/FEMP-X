package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12841DifferenceFindingTest {
    @Test
    void onlyMethod1ChecksBeyondFirstArrayElement() {
        ClonePair12841 clonePair = new ClonePair12841();
        String[] names = {"a", "b"};

        assertTrue(clonePair.method1("b", names, false));
        assertFalse(clonePair.method2("b", names, false));
    }
}
