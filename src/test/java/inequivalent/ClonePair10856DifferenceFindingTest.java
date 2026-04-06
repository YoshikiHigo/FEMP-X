package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10856DifferenceFindingTest {
    @Test
    void methodsUseDifferentWhitespaceDefinitions() {
        ClonePair10856 clonePair = new ClonePair10856();

        assertEquals(0, clonePair.method1("\t", 0));
        assertEquals(1, clonePair.method2("\t", 0));
    }
}
