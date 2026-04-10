package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair135DifferenceFindingTest {

    private final ClonePair135 subject = new ClonePair135();

    @Test
    void methodsRoundIntermediateValuesDifferently() {
        assertEquals(0.1236, subject.method1(0.1236, 0.0, 1.0), 0.0);
        assertEquals(0.1235, subject.method2(0.1236, 0.0, 1.0), 0.0);
    }
}
