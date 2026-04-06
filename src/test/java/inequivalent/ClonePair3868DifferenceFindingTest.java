package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3868DifferenceFindingTest {

    private final ClonePair3868 subject = new ClonePair3868();

    @Test
    void methodsTreatLessThanAndEqualityDifferently() {
        Double[] left = {0.0, 0.0, 0.0, 1.0};
        Double[] right = {0.0, 0.0, 0.0, 2.0};

        assertTrue(subject.method1(left, right));
        assertFalse(subject.method2(left, right));
    }
}
