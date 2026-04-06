package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12549DifferenceFindingTest {
    @Test
    void methodsEscapeApostropheDifferently() {
        ClonePair12549 clonePair = new ClonePair12549();

        assertEquals("&apos;", clonePair.method1("'", true));
        assertEquals("'", clonePair.method2("'", true));
    }
}
