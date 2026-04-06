package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5124DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5124 clonePair = new ClonePair5124();

        List<String> values = List.of("A");

        assertFalse(clonePair.method1(values, "a"));
        assertTrue(clonePair.method2(values, "a"));
    }
}
