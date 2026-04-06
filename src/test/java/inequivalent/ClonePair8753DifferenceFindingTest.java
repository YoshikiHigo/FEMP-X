package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8753DifferenceFindingTest {
    @Test
    void methodsAllowDifferentLetters() {
        ClonePair8753 clonePair = new ClonePair8753();

        assertFalse(clonePair.method1('a'));
        assertTrue(clonePair.method2('a'));
    }
}
