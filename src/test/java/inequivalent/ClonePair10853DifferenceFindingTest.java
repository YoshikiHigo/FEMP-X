package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10853DifferenceFindingTest {
    @Test
    void methodsUseDifferentWhitespaceDefinitions() {
        ClonePair10853 clonePair = new ClonePair10853();

        assertEquals(0, clonePair.method1("\n", 0));
        assertEquals(-1, clonePair.method2("\n", 0));
    }
}
