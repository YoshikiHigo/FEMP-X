package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11056DifferenceFindingTest {
    @Test
    void methodsReplaceFirstAndAllOccurrencesDifferently() {
        ClonePair11056 clonePair = new ClonePair11056();

        assertEquals("xa", clonePair.method1("aa", "a", "x"));
        assertEquals("xx", clonePair.method2("aa", "a", "x"));
    }
}
