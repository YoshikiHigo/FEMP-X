package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4157DifferenceFindingTest {

    private final ClonePair4157 subject = new ClonePair4157();

    @Test
    void methodsInterpretWildcardDifferently() {
        assertFalse(subject.method1("a*", "ab"));
        assertTrue(subject.method2("a*", "ab"));
    }
}
