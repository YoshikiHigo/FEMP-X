package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair10368DifferenceFindingTest {
    @Test
    void methodsHandleBlankStringDifferently() {
        ClonePair10368 clonePair = new ClonePair10368();

        assertThrows(NumberFormatException.class, () -> clonePair.method1(" "));
        assertNull(clonePair.method2(" "));
    }
}
