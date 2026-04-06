package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11586DifferenceFindingTest {
    @Test
    void method2RepeatsReplacementUntilPatternDisappears() {
        ClonePair11586 clonePair = new ClonePair11586();

        assertEquals("ab", clonePair.method1("abb", "ab", "a"));
        assertEquals("a", clonePair.method2("abb", "ab", "a"));
    }
}
