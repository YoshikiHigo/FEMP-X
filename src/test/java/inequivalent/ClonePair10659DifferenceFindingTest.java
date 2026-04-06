package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10659DifferenceFindingTest {
    @Test
    void methodsUseDifferentWhitespaceDefinitions() {
        ClonePair10659 clonePair = new ClonePair10659();

        assertEquals(0, clonePair.method1("\f", 0));
        assertEquals(1, clonePair.method2("\f", 0));
    }
}
