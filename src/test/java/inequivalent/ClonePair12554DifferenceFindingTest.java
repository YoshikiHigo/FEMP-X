package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12554DifferenceFindingTest {
    @Test
    void methodsEscapeNonBreakingSpaceDifferently() {
        ClonePair12554 clonePair = new ClonePair12554();

        assertEquals("&nbsp;", clonePair.method1("\u00A0", false));
        assertEquals("\u00A0", clonePair.method2("\u00A0", false));
    }
}
