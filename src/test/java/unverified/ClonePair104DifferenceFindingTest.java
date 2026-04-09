package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair104DifferenceFindingTest {

    private final ClonePair104 subject = new ClonePair104();

    @Test
    void methodsRoundIntermediateValuesDifferently() {
        assertEquals(0.1236, subject.method1(0.1236, 0.0, 1.0), 0.0);
        assertEquals(0.1235, subject.method2(0.1236, 0.0, 1.0), 0.0);
    }
}
