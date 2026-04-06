package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12534DifferenceFindingTest {
    @Test
    void methodsHandleInvalidXmlControlCharactersDifferently() {
        ClonePair12534 clonePair = new ClonePair12534();

        assertEquals("\u0001", clonePair.method1("\u0001", false));
        assertEquals("", clonePair.method2("\u0001", false));
    }
}
