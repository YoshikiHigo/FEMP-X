package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3109DifferenceFindingTest {

    private final ClonePair3109 subject = new ClonePair3109();

    @Test
    void methodsTreatZeroLengthFourAddressDifferently() {
        byte[] address = new byte[4];

        assertFalse(subject.method1(address));
        assertTrue(subject.method2(address));
    }
}
