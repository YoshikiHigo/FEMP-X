package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3197DifferenceFindingTest {

    private final ClonePair3197 subject = new ClonePair3197();

    @Test
    void methodsLimitNaNDifferently() {
        assertEquals("NaN", subject.method1(Double.NaN, 1));
        assertEquals("N", subject.method2(Double.NaN, 1));
    }
}
