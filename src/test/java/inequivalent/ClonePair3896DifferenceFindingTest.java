package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3896DifferenceFindingTest {

    private final ClonePair3896 subject = new ClonePair3896();

    @Test
    void methodsTreatBlankStringsDifferently() {
        assertTrue(subject.method1("\t", "\t"));
        assertFalse(subject.method2("\t", "\t"));
    }
}
