package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8324DifferenceFindingTest {
    @Test
    void methodsComparePrefixAndWholeStringDifferently() {
        ClonePair8324 clonePair = new ClonePair8324();

        assertTrue(clonePair.method1("a", "ab"));
        assertFalse(clonePair.method2("a", "ab"));
    }
}
