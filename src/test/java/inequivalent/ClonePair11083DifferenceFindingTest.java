package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair11083DifferenceFindingTest {
    @Test
    void methodsCompareStringsWithDifferentCaseSensitivity() {
        ClonePair11083 clonePair = new ClonePair11083();
        String[] values = {"A"};

        assertTrue(clonePair.method1(values, "a"));
        assertFalse(clonePair.method2(values, "a"));
    }
}
