package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12484DifferenceFindingTest {
    @Test
    void methodsCollapseDifferentWhitespaceCharacters() {
        ClonePair12484 clonePair = new ClonePair12484();

        assertEquals("a b", clonePair.method1("a\fb", true));
        assertEquals("a\fb", clonePair.method2("a\fb", true));
    }
}
