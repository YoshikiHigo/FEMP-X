package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9326DifferenceFindingTest {
    @Test
    void methodsIgnoreWhitespaceInsideBracesDifferently() {
        ClonePair9326 clonePair = new ClonePair9326();

        assertEquals(-1, clonePair.method1("{ }", 0));
        assertEquals(1, clonePair.method2("{ }", 0));
    }
}
