package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair12313DifferenceFindingTest {
    @Test
    void methodsHandleNullReplacementDifferently() {
        ClonePair12313 clonePair = new ClonePair12313();

        assertThrows(NullPointerException.class, () -> clonePair.method1("a", "a", null));
        assertEquals("null", clonePair.method2("a", "a", null));
    }
}
