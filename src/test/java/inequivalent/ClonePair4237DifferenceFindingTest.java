package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4237DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4237 clonePair = new ClonePair4237();

        Object[] range = {0.1, 0.2};

        assertFalse(clonePair.method1(0.5, range));
        assertTrue(clonePair.method2(0.5, range));
    }
}
