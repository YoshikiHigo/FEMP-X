package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5130DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5130 clonePair = new ClonePair5130();

        char[] values = {(char) 129};

        assertEquals("&uuml;", clonePair.method1(values, 1));
        assertEquals("&#129;", clonePair.method2(values, 1));
    }
}
