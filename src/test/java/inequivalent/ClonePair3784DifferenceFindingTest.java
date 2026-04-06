package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3784DifferenceFindingTest {

    private final ClonePair3784 subject = new ClonePair3784();

    @Test
    void methodsTreatCaseDifferently() {
        assertEquals(0, subject.method1("a", new String[]{"A"}));
        assertEquals(-1, subject.method2("a", new String[]{"A"}));
    }
}
