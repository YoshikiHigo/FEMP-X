package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair13387DifferenceFindingTest {

    private final ClonePair13387 subject = new ClonePair13387();

    @Test
    void methodsTreatTranspositionDifferently() {
        assertEquals(1, subject.method1("ab", "ba", 3, new int[9]));
        assertEquals(2, subject.method2("ab", "ba", 3, new int[9]));
    }
}
