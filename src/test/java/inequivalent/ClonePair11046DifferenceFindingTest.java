package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11046DifferenceFindingTest {
    @Test
    void methodsCompareStringsWithDifferentCaseSensitivity() {
        ClonePair11046 clonePair = new ClonePair11046();
        String[] values = {"A"};

        assertFalse(clonePair.method1(values, "a"));
        assertTrue(clonePair.method2(values, "a"));
    }
}
