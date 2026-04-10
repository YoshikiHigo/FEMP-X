package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1469DifferenceFindingTest {

    private final ClonePair1469 subject = new ClonePair1469();

    @Test
    void methodsHandleLargeLongObjectsDifferently() {
        Object input = Long.valueOf(2147483648L);

        assertEquals(0, subject.method1(input));
        assertEquals(-2147483648, subject.method2(input));
    }
}
