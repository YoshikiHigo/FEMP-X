package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4211DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4211 clonePair = new ClonePair4211();

        assertEquals(1.0f, clonePair.method1(0.5f, 0.5f, 1.0f));
        assertEquals(0.5f, clonePair.method2(0.5f, 0.5f, 1.0f));
    }
}
