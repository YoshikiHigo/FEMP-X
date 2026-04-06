package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4218DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4218 clonePair = new ClonePair4218();

        List<String> values = List.of("alpha");

        assertTrue(clonePair.method1(values, "alp"));
        assertFalse(clonePair.method2(values, "alp"));
    }
}
