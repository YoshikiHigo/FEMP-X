package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3179DifferenceFindingTest {

    private final ClonePair3179 subject = new ClonePair3179();

    @Test
    void methodsRemovePrefixAndSuffixDifferently() {
        assertEquals("bc", subject.method1("abc", "a", false));
        assertEquals("abc", subject.method2("abc", "a", false));
    }
}
