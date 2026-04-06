package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair12298DifferenceFindingTest {
    @Test
    void methodsHandleNullSearchStringDifferently() {
        ClonePair12298 clonePair = new ClonePair12298();

        assertEquals("a", clonePair.method1("a", null, "x"));
        assertThrows(NullPointerException.class, () -> clonePair.method2("a", null, "x"));
    }
}
