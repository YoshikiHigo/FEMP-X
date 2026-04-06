package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3766DifferenceFindingTest {

    private final ClonePair3766 subject = new ClonePair3766();

    @Test
    void methodsTreatWhitespaceInPatternDifferently() {
        assertTrue(subject.method1("a b", "ab"));
        assertFalse(subject.method2("a b", "ab"));
    }
}
