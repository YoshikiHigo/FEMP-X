package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6009DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair6009 clonePair = new ClonePair6009();

        assertFalse(clonePair.method1("a", "ba"));
        assertTrue(clonePair.method2("a", "ba"));
    }
}
