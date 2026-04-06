package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9029DifferenceFindingTest {
    @Test
    void methodsCompareNumericStringsDifferently() {
        ClonePair9029 clonePair = new ClonePair9029();

        assertFalse(clonePair.method1("01", "1"));
        assertTrue(clonePair.method2("01", "1"));
    }
}
