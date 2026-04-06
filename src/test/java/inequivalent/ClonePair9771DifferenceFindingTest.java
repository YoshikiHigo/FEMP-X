package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9771DifferenceFindingTest {
    @Test
    void methodsHandleNullReplacementDifferently() {
        ClonePair9771 clonePair = new ClonePair9771();

        assertEquals("b", clonePair.method1("aba", "a", null));
        assertEquals("aba", clonePair.method2("aba", "a", null));
    }
}
