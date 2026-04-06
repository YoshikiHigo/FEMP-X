package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8142DifferenceFindingTest {
    @Test
    void methodsHandleCaseDifferentlyForLongPasswords() {
        ClonePair8142 clonePair = new ClonePair8142();

        assertTrue(clonePair.method1("abcde", "ABCDE"));
        assertFalse(clonePair.method2("abcde", "ABCDE"));
    }
}
