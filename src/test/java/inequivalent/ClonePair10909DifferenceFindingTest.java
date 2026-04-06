package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10909DifferenceFindingTest {
    @Test
    void methodsUseCharacterAndByteLengthDifferently() {
        ClonePair10909 clonePair = new ClonePair10909();

        assertEquals("\u00E9x", clonePair.method1("\u00E9", 2, "x"));
        assertEquals("\u00E9", clonePair.method2("\u00E9", 2, "x"));
    }
}
