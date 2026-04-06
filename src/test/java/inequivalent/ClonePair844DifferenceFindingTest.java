package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair844DifferenceFindingTest {

    private final ClonePair844 subject = new ClonePair844();

    @Test
    void methodsInterpretShortPatternDifferently() {
        boolean[] method1 = subject.method1("010", "");
        boolean[] method2 = subject.method2("010", "");

        assertFalse(method1[0]);
        assertTrue(method2[0]);
    }
}
