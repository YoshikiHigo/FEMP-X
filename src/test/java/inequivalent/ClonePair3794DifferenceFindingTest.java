package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3794DifferenceFindingTest {

    private final ClonePair3794 subject = new ClonePair3794();

    @Test
    void methodsTreatBlankPrefixDifferently() {
        assertFalse(subject.method1("\t", "\t"));
        assertTrue(subject.method2("\t", "\t"));
    }
}
