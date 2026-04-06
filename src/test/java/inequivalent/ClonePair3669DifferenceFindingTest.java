package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3669DifferenceFindingTest {

    private final ClonePair3669 subject = new ClonePair3669();

    @Test
    void methodsTruncateDockedStringDifferently() {
        assertEquals("", subject.method1("abcd", 2, '_', true));
        assertEquals("ab", subject.method2("abcd", 2, '_', true));
    }
}
