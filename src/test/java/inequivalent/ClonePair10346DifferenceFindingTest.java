package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair10346DifferenceFindingTest {
    @Test
    void methodsComparePrefixesWithDifferentCaseSensitivity() {
        ClonePair10346 clonePair = new ClonePair10346();

        assertFalse(clonePair.method1("A", "a"));
        assertTrue(clonePair.method2("A", "a"));
    }
}
