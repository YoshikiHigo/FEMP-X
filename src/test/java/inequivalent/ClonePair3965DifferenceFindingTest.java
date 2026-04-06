package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3965DifferenceFindingTest {

    private final ClonePair3965 subject = new ClonePair3965();

    @Test
    void methodsCompareSignedAndUnsignedBytesDifferently() {
        assertEquals(-1, subject.method1(new byte[]{-1}, new byte[]{0}));
        assertEquals(1, subject.method2(new byte[]{-1}, new byte[]{0}));
    }
}
