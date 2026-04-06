package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4624DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4624 clonePair = new ClonePair4624();

        assertFalse(clonePair.method1(7));
        assertTrue(clonePair.method2(7));
    }
}
