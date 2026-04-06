package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12364DifferenceFindingTest {
    @Test
    void methodsInterpretBooleanFlagDifferently() {
        ClonePair12364 clonePair = new ClonePair12364();

        assertEquals("\n", clonePair.method1("\n", true));
        assertEquals("<br>", clonePair.method2("\n", true));
    }
}
