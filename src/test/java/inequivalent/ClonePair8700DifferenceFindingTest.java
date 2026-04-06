package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8700DifferenceFindingTest {
    @Test
    void methodsAllowPunctuationDifferently() {
        ClonePair8700 clonePair = new ClonePair8700();

        assertTrue(clonePair.method1('!'));
        assertFalse(clonePair.method2('!'));
    }
}
