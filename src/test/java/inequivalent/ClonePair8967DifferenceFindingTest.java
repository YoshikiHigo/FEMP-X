package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8967DifferenceFindingTest {
    @Test
    void methodsAllowPunctuationDifferently() {
        ClonePair8967 clonePair = new ClonePair8967();

        assertFalse(clonePair.method1('!'));
        assertTrue(clonePair.method2('!'));
    }
}
