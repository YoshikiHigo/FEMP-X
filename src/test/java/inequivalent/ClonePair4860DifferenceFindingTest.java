package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4860DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4860 clonePair = new ClonePair4860();

        assertEquals("cd", clonePair.method1("abcd", 2, 0));
        assertEquals("ab", clonePair.method2("abcd", 2, 0));
    }
}
