package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4060DifferenceFindingTest {

    private final ClonePair4060 subject = new ClonePair4060();

    @Test
    void methodsTreatCaseDifferently() {
        assertFalse(subject.method1(new String[]{"a"}, new String[]{"A"}));
        assertTrue(subject.method2(new String[]{"a"}, new String[]{"A"}));
    }
}
