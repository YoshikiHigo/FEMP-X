package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11395DifferenceFindingTest {
    @Test
    void methodsReplaceNthAndUpToMaxOccurrencesDifferently() {
        ClonePair11395 clonePair = new ClonePair11395();

        assertEquals("ax", clonePair.method1("aa", "a", "x", 2));
        assertEquals("xx", clonePair.method2("aa", "a", "x", 2));
    }
}
