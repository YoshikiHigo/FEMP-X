package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12451DifferenceFindingTest {
    @Test
    void methodsInterpretTrimFlagDifferently() {
        ClonePair12451 clonePair = new ClonePair12451();

        assertEquals("a", clonePair.method1(" a ", false));
        assertEquals(" a ", clonePair.method2(" a ", false));
    }
}
