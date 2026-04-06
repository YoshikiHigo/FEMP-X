package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1684DifferenceFindingTest {

    private final ClonePair1684 subject = new ClonePair1684();

    @Test
    void methodsTreatSharedNullReferenceDifferently() {
        assertFalse(subject.method1(null, null));
        assertTrue(subject.method2(null, null));
    }
}
