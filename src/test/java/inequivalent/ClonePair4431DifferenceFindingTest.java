package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4431DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4431 clonePair = new ClonePair4431();

        assertTrue(clonePair.method1("A", "a"));
        assertFalse(clonePair.method2("A", "a"));
    }
}
