package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5035DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5035 clonePair = new ClonePair5035();

        assertEquals(0, clonePair.method1(-1, -1));
        assertEquals(-1, clonePair.method2(-1, -1));
    }
}
