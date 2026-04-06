package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3233DifferenceFindingTest {

    private final ClonePair3233 subject = new ClonePair3233();

    @Test
    void methodsTreatCaseDifferently() {
        assertEquals(0, subject.method1("a", "A"));
        assertEquals(32, subject.method2("a", "A"));
    }
}
