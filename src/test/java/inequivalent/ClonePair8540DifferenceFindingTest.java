package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8540DifferenceFindingTest {
    @Test
    void methodsCompareFirstCharacterDifferently() {
        ClonePair8540 clonePair = new ClonePair8540();

        assertTrue(clonePair.method1(new StringBuffer("ab"), "xb"));
        assertFalse(clonePair.method2(new StringBuffer("ab"), "xb"));
    }
}
