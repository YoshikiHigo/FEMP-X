package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair9194DifferenceFindingTest {
    @Test
    void methodsCheckSuffixAndPrefixDifferently() {
        ClonePair9194 clonePair = new ClonePair9194();

        assertTrue(clonePair.method1("abc", "bc"));
        assertFalse(clonePair.method2("abc", "bc"));
    }
}
