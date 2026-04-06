package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair10264DifferenceFindingTest {
    @Test
    void methodsHandleBlankStringDifferently() {
        ClonePair10264 clonePair = new ClonePair10264();

        assertThrows(NumberFormatException.class, () -> clonePair.method1(" "));
        assertNull(clonePair.method2(" "));
    }
}
