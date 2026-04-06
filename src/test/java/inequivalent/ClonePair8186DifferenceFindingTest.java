package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8186DifferenceFindingTest {
    @Test
    void methodsSkipDifferentWhitespaceCharacters() {
        ClonePair8186 clonePair = new ClonePair8186();

        assertEquals(0, clonePair.method1("\n", 1, 0));
        assertEquals(1, clonePair.method2("\n", 1, 0));
    }
}
