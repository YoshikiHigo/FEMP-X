package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5683DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5683 clonePair = new ClonePair5683();

        assertTrue(clonePair.method1("a ", "a", true));
        assertFalse(clonePair.method2("a ", "a", true));
    }
}
