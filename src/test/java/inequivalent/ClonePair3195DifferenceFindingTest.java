package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3195DifferenceFindingTest {

    private final ClonePair3195 subject = new ClonePair3195();

    @Test
    void methodsFormatNaNDifferently() {
        assertEquals("NaN.0", subject.method1(Double.NaN, 1));
        assertEquals("NaN", subject.method2(Double.NaN, 1));
    }
}
