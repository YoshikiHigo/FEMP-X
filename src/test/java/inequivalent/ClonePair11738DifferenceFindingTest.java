package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11738DifferenceFindingTest {
    @Test
    void methodsReplaceAnyOccurrenceAndSuffixDifferently() {
        ClonePair11738 clonePair = new ClonePair11738();

        assertEquals("xb", clonePair.method1("ab", "a", "x"));
        assertEquals("ab", clonePair.method2("ab", "a", "x"));
    }
}
