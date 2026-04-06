package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4509DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4509 clonePair = new ClonePair4509();

        assertTrue(clonePair.method1("abc", "a*"));
        assertFalse(clonePair.method2("abc", "a*"));
    }
}
