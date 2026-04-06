package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7658DifferenceFindingTest {
    @Test
    void methodsCompareWholeStringAndSuffixDifferently() {
        ClonePair7658 clonePair = new ClonePair7658();

        assertFalse(clonePair.method1("abc", "bc"));
        assertTrue(clonePair.method2("abc", "bc"));
    }
}
