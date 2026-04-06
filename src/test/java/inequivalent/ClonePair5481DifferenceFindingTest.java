package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5481DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5481 clonePair = new ClonePair5481();

        assertEquals("", clonePair.method1(new StringBuffer("\t")).toString());
        assertEquals("\t", clonePair.method2(new StringBuffer("\t")).toString());
    }
}
