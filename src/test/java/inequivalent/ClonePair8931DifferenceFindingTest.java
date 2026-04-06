package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8931DifferenceFindingTest {
    @Test
    void methodsCheckSuffixAndPrefixDifferently() {
        ClonePair8931 clonePair = new ClonePair8931();

        assertTrue(clonePair.method1("abc", "bc"));
        assertFalse(clonePair.method2("abc", "bc"));
    }
}
