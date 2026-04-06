package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4858DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4858 clonePair = new ClonePair4858();

        assertEquals("bcd", clonePair.method1("abcdef", 1, 3));
        assertEquals("bc...", clonePair.method2("abcdef", 1, 3));
    }
}
