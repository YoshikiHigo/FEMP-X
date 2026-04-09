package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair101DifferenceFindingTest {

    private final ClonePair101 subject = new ClonePair101();

    @Test
    void methodsHandleNaNValueDifferently() {
        assertTrue(Double.isNaN(subject.method1(Double.NaN, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY)));
        assertEquals(Double.NEGATIVE_INFINITY, subject.method2(Double.NaN, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY));
    }
}
