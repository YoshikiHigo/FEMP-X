package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13268DifferenceFindingTest {

    private final ClonePair13268 subject = new ClonePair13268();

    @Test
    void methodsInterpretPlainOptionDifferently() {
        assertFalse(subject.method1("010"));
        assertTrue(subject.method2("010"));
    }
}
