package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4647DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4647 clonePair = new ClonePair4647();

        assertTrue(clonePair.method1("A", "a"));
        assertFalse(clonePair.method2("A", "a"));
    }
}
