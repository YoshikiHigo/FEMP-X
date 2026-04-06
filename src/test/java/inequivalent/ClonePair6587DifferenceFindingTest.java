package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6587DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6587 clonePair = new ClonePair6587();

        assertFalse(clonePair.method1(new long[]{1L, 2L}, new long[]{2L, 1L}));
        assertTrue(clonePair.method2(new long[]{1L, 2L}, new long[]{2L, 1L}));
    }
}
