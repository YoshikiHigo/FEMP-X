package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1480DifferenceFindingTest {

    private final ClonePair1480 subject = new ClonePair1480();

    @Test
    void methodsHandleDoubleObjectsDifferently() {
        Object input = Double.valueOf(3.9);

        assertEquals(3, subject.method1(input));
        assertEquals(0, subject.method2(input));
    }
}
