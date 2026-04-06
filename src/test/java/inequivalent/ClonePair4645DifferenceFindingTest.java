package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4645DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4645 clonePair = new ClonePair4645();

        assertFalse(clonePair.method1("", ""));
        assertTrue(clonePair.method2("", ""));
    }
}
