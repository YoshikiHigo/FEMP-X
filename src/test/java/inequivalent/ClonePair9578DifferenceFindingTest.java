package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9578DifferenceFindingTest {
    @Test
    void methodsHandleBothNullArraysDifferently() {
        ClonePair9578 clonePair = new ClonePair9578();

        assertTrue(clonePair.method1(null, null));
        assertThrows(NullPointerException.class, () -> clonePair.method2(null, null));
    }
}
