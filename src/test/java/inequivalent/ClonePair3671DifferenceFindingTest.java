package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3671DifferenceFindingTest {

    private final ClonePair3671 subject = new ClonePair3671();

    @Test
    void methodsCompareWholeStringAndFirstTokenDifferently() {
        assertFalse(subject.method1("a b", "a"));
        assertTrue(subject.method2("a b", "a"));
    }
}
