package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11611DifferenceFindingTest {
    @Test
    void methodsReplaceFirstAndAllOccurrencesDifferently() {
        ClonePair11611 clonePair = new ClonePair11611();

        assertEquals("xa", clonePair.method1("aa", "a", "x"));
        assertEquals("xx", clonePair.method2("aa", "a", "x"));
    }
}
