package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5744DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5744 clonePair = new ClonePair5744();

        assertTrue(clonePair.method1("T", false));
        assertFalse(clonePair.method2("T", false));
    }
}
