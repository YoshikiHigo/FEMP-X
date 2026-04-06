package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8160DifferenceFindingTest {
    @Test
    void methodsCompareNumericAndPatternStringsDifferently() {
        ClonePair8160 clonePair = new ClonePair8160();

        assertTrue(clonePair.method1("1", "1.0"));
        assertFalse(clonePair.method2("1", "1.0"));
    }
}
