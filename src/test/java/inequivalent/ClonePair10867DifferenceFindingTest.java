package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair10867DifferenceFindingTest {
    @Test
    void methodsHandleNullReplacementDifferently() {
        ClonePair10867 clonePair = new ClonePair10867();

        assertEquals("a", clonePair.method1("a", "a", null));
        assertThrows(NullPointerException.class, () -> clonePair.method2("a", "a", null));
    }
}
