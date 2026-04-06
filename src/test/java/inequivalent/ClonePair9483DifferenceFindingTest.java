package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9483DifferenceFindingTest {
    @Test
    void methodsCheckDifferentEndsOfTheArray() {
        ClonePair9483 clonePair = new ClonePair9483();
        int[] values = {1, -1, -1};

        assertTrue(clonePair.method1(values));
        assertFalse(clonePair.method2(values));
    }
}
