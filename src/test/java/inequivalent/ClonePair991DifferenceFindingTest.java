package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair991DifferenceFindingTest {

    private final ClonePair991 subject = new ClonePair991();

    @Test
    void methodsTreatNonZeroCloseValuesDifferently() {
        assertTrue(subject.method1(2.0, 2.05, 0.1));
        assertFalse(subject.method2(2.0, 2.05, 0.1));
    }
}
