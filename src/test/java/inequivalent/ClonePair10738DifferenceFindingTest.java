package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10738DifferenceFindingTest {
    @Test
    void methodsHandleNullReplacementDifferently() {
        ClonePair10738 clonePair = new ClonePair10738();

        assertEquals("", clonePair.method1("a", "a", null));
        assertEquals("null", clonePair.method2("a", "a", null));
    }
}
