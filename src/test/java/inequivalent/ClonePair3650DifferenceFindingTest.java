package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3650DifferenceFindingTest {

    private final ClonePair3650 subject = new ClonePair3650();

    @Test
    void methodsTreatStringCaseDifferently() {
        assertEquals(32, subject.method1("a", "A"));
        assertEquals(0, subject.method2("a", "A"));
    }
}
