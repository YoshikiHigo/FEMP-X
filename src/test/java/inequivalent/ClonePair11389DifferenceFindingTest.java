package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11389DifferenceFindingTest {
    @Test
    void methodsHandleZeroMaxReplacementsDifferently() {
        ClonePair11389 clonePair = new ClonePair11389();

        assertEquals("a", clonePair.method1("a", "a", "x", 0));
        assertEquals("x", clonePair.method2("a", "a", "x", 0));
    }
}
