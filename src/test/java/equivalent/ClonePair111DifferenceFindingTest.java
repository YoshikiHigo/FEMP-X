package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair111DifferenceFindingTest {

    private final ClonePair111 subject = new ClonePair111();

    @Test
    void methodsHandleNaNFirstArgumentDifferently() {
        assertEquals(Double.NEGATIVE_INFINITY, subject.method1(Double.NaN, -1.0, Double.NEGATIVE_INFINITY));
        assertEquals(-1.0, subject.method2(Double.NaN, -1.0, Double.NEGATIVE_INFINITY));
    }
}
