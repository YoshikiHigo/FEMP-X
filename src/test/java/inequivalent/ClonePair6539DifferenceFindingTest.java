package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair6539DifferenceFindingTest {
    @Test
    void onlyMethod1ComparesNumericStringsByParsedValue() {
        ClonePair6539 clonePair = new ClonePair6539();

        assertTrue(clonePair.method1("1", "01"));
        assertFalse(clonePair.method2("1", "01"));
    }
}
