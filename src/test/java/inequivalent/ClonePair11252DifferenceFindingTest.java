package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11252DifferenceFindingTest {
    @Test
    void methodsReplaceFirstAndLastOccurrencesDifferently() {
        ClonePair11252 clonePair = new ClonePair11252();

        assertEquals("xa", clonePair.method1("aa", "a", "x"));
        assertEquals("ax", clonePair.method2("aa", "a", "x"));
    }
}
