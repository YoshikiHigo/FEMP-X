package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12863DifferenceFindingTest {
    @Test
    void methodsRemoveDifferentNumbersOfLeadingSlashes() {
        ClonePair12863 clonePair = new ClonePair12863();

        assertEquals("/a", clonePair.method1("//a"));
        assertEquals("a", clonePair.method2("//a"));
    }
}
