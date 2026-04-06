package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5311DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5311 clonePair = new ClonePair5311();

        assertEquals(2, clonePair.method1("ab", "ba", new int[9]));
        assertEquals(1, clonePair.method2("ab", "ba", new int[9]));
    }
}
