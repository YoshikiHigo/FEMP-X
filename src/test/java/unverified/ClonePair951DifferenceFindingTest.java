package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair951DifferenceFindingTest {

    private final ClonePair951 subject = new ClonePair951();

    @Test
    void methodsHandleNaNInputsDifferently() {
        assertTrue(Double.isNaN(subject.method1(Double.NaN, true)));
        assertEquals(0.0, subject.method2(Double.NaN, true), 0.0);
    }
}
