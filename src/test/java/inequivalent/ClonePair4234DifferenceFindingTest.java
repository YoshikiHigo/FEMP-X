package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4234DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4234 clonePair = new ClonePair4234();

        float a = Float.NaN;
        float b = Float.NEGATIVE_INFINITY;
        float c = Float.NEGATIVE_INFINITY;

        assertEquals(Float.NEGATIVE_INFINITY, clonePair.method1(a, b, c));
        assertTrue(Float.isNaN(clonePair.method2(a, b, c)));
    }
}
