package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4401DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4401 clonePair = new ClonePair4401();

        assertEquals(0.5 * Math.sin(0.5 * Math.PI * 0.5), clonePair.method1(0.5, 0.0));
        assertEquals(0.34375, clonePair.method2(0.5, 0.0));
    }
}
