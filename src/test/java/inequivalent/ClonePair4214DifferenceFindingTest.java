package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4214DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4214 clonePair = new ClonePair4214();

        List<String> values = List.of("A");

        assertFalse(clonePair.method1(values, "a"));
        assertTrue(clonePair.method2(values, "a"));
    }
}
