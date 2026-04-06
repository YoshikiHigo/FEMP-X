package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5126DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5126 clonePair = new ClonePair5126();

        char[] buffer = {'a'};
        char[] tag = {'?'};

        assertFalse(clonePair.method1(buffer, 0, tag));
        assertTrue(clonePair.method2(buffer, 0, tag));
    }
}
