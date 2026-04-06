package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12543DifferenceFindingTest {
    @Test
    void methodsUseDifferentWhitespaceDefinitions() {
        ClonePair12543 clonePair = new ClonePair12543();

        assertEquals(0, clonePair.method1("\f"));
        assertEquals(-1, clonePair.method2("\f"));
    }
}
