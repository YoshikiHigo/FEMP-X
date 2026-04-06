package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11204DifferenceFindingTest {
    @Test
    void methodsInterpretReplacementPatternDifferently() {
        ClonePair11204 clonePair = new ClonePair11204();

        assertEquals("x", clonePair.method1("{a}", "a", "x"));
        assertEquals("{x}", clonePair.method2("{a}", "a", "x"));
    }
}
