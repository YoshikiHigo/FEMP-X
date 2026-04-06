package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8328DifferenceFindingTest {
    @Test
    void methodsCompareNumericValuesAndPrefixesDifferently() {
        ClonePair8328 clonePair = new ClonePair8328();

        assertTrue(clonePair.method1("01", "1"));
        assertFalse(clonePair.method2("01", "1"));
    }
}
