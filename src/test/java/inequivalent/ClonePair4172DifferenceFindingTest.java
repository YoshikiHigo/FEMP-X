package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4172DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4172 clonePair = new ClonePair4172();

        float a = Float.NaN;
        float b = -1.0f;
        float c = Float.NEGATIVE_INFINITY;

        assertEquals(-1.0f, clonePair.method1(a, b, c));
        assertEquals(Float.NEGATIVE_INFINITY, clonePair.method2(a, b, c));
    }
}
