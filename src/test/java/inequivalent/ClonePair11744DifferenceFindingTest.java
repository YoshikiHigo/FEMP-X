package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11744DifferenceFindingTest {
    @Test
    void methodsReplaceAllAndFirstOccurrencesDifferently() {
        ClonePair11744 clonePair = new ClonePair11744();

        assertEquals("xx", clonePair.method1("aa", "a", "x"));
        assertEquals("xa", clonePair.method2("aa", "a", "x"));
    }
}
