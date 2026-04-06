package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4786DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4786 clonePair = new ClonePair4786();

        assertEquals("axx", clonePair.method1("a", 'x', 3));
        assertEquals("xxa", clonePair.method2("a", 'x', 3));
    }
}
