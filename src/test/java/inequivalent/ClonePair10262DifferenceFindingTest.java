package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10262DifferenceFindingTest {
    @Test
    void methodsReplaceSuffixAndAllOccurrencesDifferently() {
        ClonePair10262 clonePair = new ClonePair10262();

        assertEquals("ax", clonePair.method1("aa", "a", "x"));
        assertEquals("xx", clonePair.method2("aa", "a", "x"));
    }
}
