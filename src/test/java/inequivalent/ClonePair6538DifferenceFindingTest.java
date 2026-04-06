package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6538DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6538 clonePair = new ClonePair6538();

        assertFalse(clonePair.method1(" a ", 1, 1));
        assertTrue(clonePair.method2(" a ", 1, 1));
    }
}
