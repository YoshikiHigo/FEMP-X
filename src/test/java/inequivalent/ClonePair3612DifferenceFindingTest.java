package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3612DifferenceFindingTest {

    private final ClonePair3612 subject = new ClonePair3612();

    @Test
    void methodsTreatRotatedArraysDifferently() {
        assertFalse(subject.method1(new int[]{1, 2, 3}, new int[]{2, 3, 1}));
        assertTrue(subject.method2(new int[]{1, 2, 3}, new int[]{2, 3, 1}));
    }
}
