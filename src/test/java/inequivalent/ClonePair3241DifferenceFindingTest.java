package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3241DifferenceFindingTest {

    private final ClonePair3241 subject = new ClonePair3241();

    @Test
    void methodsTreatCaseDifferently() {
        assertEquals(32, subject.method1("a", "A"));
        assertEquals(0, subject.method2("a", "A"));
    }
}
