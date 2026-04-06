package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9584DifferenceFindingTest {
    @Test
    void methodsUseDifferentWhitespaceDefinitions() {
        ClonePair9584 clonePair = new ClonePair9584();

        assertEquals(-1, clonePair.method1("\n", 0));
        assertEquals(0, clonePair.method2("\n", 0));
    }
}
