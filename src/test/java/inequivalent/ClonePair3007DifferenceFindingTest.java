package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3007DifferenceFindingTest {

    private final ClonePair3007 subject = new ClonePair3007();

    @Test
    void methodsTreatCaseDifferently() {
        assertEquals(0, subject.method1("a", "A"));
        assertEquals(32, subject.method2("a", "A"));
    }
}
