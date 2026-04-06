package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4702DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4702 clonePair = new ClonePair4702();

        assertFalse(clonePair.method1(3));
        assertTrue(clonePair.method2(3));
    }
}
