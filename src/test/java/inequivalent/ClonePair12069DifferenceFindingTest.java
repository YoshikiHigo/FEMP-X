package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12069DifferenceFindingTest {
    @Test
    void methodsReplaceAllAndFirstOccurrencesDifferently() {
        ClonePair12069 clonePair = new ClonePair12069();

        assertEquals("xx", clonePair.method1("aa", "a", "x"));
        assertEquals("xa", clonePair.method2("aa", "a", "x"));
    }
}
