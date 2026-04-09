package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair108DifferenceFindingTest {

    private final ClonePair108 subject = new ClonePair108();

    @Test
    void methodsHandleNaNInputsDifferently() {
        assertEquals(1.0, subject.method1(Double.NaN, 1.0, 2.0), 0.0);
        assertTrue(Double.isNaN(subject.method2(Double.NaN, 1.0, 2.0)));
    }
}
