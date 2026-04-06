package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8216DifferenceFindingTest {
    @Test
    void methodsHandleFalseBooleanDifferently() {
        ClonePair8216 clonePair = new ClonePair8216();

        assertFalse(clonePair.method1(Boolean.FALSE));
        assertTrue(clonePair.method2(Boolean.FALSE));
    }
}
