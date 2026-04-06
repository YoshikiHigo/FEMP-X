package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5952DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5952 clonePair = new ClonePair5952();

        assertEquals("th", clonePair.method1(111));
        assertEquals("st", clonePair.method2(111));
    }
}
