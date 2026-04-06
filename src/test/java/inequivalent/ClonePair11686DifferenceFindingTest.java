package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair11686DifferenceFindingTest {
    @Test
    void methodsHandleNullReplacementDifferently() {
        ClonePair11686 clonePair = new ClonePair11686();

        assertThrows(NullPointerException.class, () -> clonePair.method1("a", "a", null));
        assertEquals("null", clonePair.method2("a", "a", null));
    }
}
