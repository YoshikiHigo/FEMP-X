package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3682DifferenceFindingTest {

    private final ClonePair3682 subject = new ClonePair3682();

    @Test
    void methodsTreatCaseDifferently() {
        assertFalse(subject.method1("A", "a"));
        assertTrue(subject.method2("A", "a"));
    }
}
