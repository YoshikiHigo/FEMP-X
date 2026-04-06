package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8849DifferenceFindingTest {
    @Test
    void methodsHandleQuestionWildcardDifferently() {
        ClonePair8849 clonePair = new ClonePair8849();

        assertTrue(clonePair.method1("?", "a"));
        assertFalse(clonePair.method2("?", "a"));
    }
}
