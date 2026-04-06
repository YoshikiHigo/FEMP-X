package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11310DifferenceFindingTest {
    @Test
    void methodsHandleHiraganaRangeDifferently() {
        ClonePair11310 clonePair = new ClonePair11310();

        assertTrue(clonePair.method1('\u3041'));
        assertFalse(clonePair.method2('\u3041'));
    }
}
