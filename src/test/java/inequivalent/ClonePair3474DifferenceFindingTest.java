package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3474DifferenceFindingTest {

    private final ClonePair3474 subject = new ClonePair3474();

    @Test
    void methodsCompareShortsAndLowBytesDifferently() {
        assertFalse(subject.method1(new short[]{256}, new short[]{0}));
        assertTrue(subject.method2(new short[]{256}, new short[]{0}));
    }
}
