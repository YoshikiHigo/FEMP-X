package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair981DifferenceFindingTest {

    private final ClonePair981 subject = new ClonePair981();

    @Test
    void methodsTreatSmallMagnitudeValuesDifferently() {
        assertTrue(subject.method1(0.5, 0.0, 0.6));
        assertFalse(subject.method2(0.5, 0.0, 0.6));
    }
}
