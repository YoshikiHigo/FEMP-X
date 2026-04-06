package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair12153DifferenceFindingTest {
    @Test
    void methodsValidateDifferentIdentifierFormats() {
        ClonePair12153 clonePair = new ClonePair12153();

        assertFalse(clonePair.method1("CB123456"));
        assertTrue(clonePair.method2("CB123456"));
    }
}
