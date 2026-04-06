package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11434DifferenceFindingTest {
    @Test
    void method1UsesOriginalStringDuringRepeatedReplacement() {
        ClonePair11434 clonePair = new ClonePair11434();

        assertEquals("ax", clonePair.method1("aa", "a", "x"));
        assertEquals("xx", clonePair.method2("aa", "a", "x"));
    }
}
