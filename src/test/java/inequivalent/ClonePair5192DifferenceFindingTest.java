package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5192DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5192 clonePair = new ClonePair5192();

        assertEquals(-1, clonePair.method1("\\,", ','));
        assertEquals(1, clonePair.method2("\\,", ','));
    }
}
