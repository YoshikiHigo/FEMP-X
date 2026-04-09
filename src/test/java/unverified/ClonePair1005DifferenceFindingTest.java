package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1005DifferenceFindingTest {

    private final ClonePair1005 subject = new ClonePair1005();

    @Test
    void methodsHandleNaNPairsDifferently() {
        assertTrue(subject.method1(Double.NaN, Double.NaN, 0.1));
        assertFalse(subject.method2(Double.NaN, Double.NaN, 0.1));
    }
}
