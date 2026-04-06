package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12133DifferenceFindingTest {
    @Test
    void methodsHandleMatchAtBeginningDifferently() {
        ClonePair12133 clonePair = new ClonePair12133();

        assertEquals("", clonePair.method1("a", "a", "x"));
        assertEquals("x", clonePair.method2("a", "a", "x"));
    }
}
