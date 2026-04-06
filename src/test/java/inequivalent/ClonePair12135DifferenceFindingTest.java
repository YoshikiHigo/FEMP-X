package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12135DifferenceFindingTest {
    @Test
    void methodsCheckDifferentStringDomains() {
        ClonePair12135 clonePair = new ClonePair12135();

        assertTrue(clonePair.method1(" CHAR "));
        assertFalse(clonePair.method2(" CHAR "));
    }
}
