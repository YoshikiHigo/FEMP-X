package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5246DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5246 clonePair = new ClonePair5246();

        assertEquals("bb", clonePair.method1(new StringBuffer("aa"), "a", "b").toString());
        assertEquals("ba", clonePair.method2(new StringBuffer("aa"), "a", "b").toString());
    }
}
