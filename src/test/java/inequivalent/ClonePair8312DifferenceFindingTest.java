package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8312DifferenceFindingTest {
    @Test
    void methodsUseUnicodeAndJavaIdentifierRulesDifferently() {
        ClonePair8312 clonePair = new ClonePair8312();

        assertFalse(clonePair.method1("$"));
        assertTrue(clonePair.method2("$"));
    }
}
