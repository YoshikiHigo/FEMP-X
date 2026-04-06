package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair105DifferenceFindingTest {

    private final ClonePair105 subject = new ClonePair105();

    @Test
    void methodsHandleInvertedBoundsDifferently() {
        assertEquals(0.0, subject.method1(0.0, 0.0, -1.0));
        assertEquals(-1.0, subject.method2(0.0, 0.0, -1.0));
    }
}
