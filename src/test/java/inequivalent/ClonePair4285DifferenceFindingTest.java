package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4285DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4285 clonePair = new ClonePair4285();

        assertTrue(clonePair.method1("ab", "ac"));
        assertFalse(clonePair.method2("ab", "ac"));
    }
}
