package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10557DifferenceFindingTest {
    @Test
    void methodsReplaceFirstAndAllOccurrencesDifferently() {
        ClonePair10557 clonePair = new ClonePair10557();

        assertEquals("xa", clonePair.method1("aa", "a", "x"));
        assertEquals("xx", clonePair.method2("aa", "a", "x"));
    }
}
