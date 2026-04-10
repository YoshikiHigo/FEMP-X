package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair1463DifferenceFindingTest {

    private final ClonePair1463 subject = new ClonePair1463();

    @Test
    void methodsHandleDoubleObjectsDifferently() {
        Object input = Double.valueOf(3.9);

        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1(input));
        assertEquals(3, subject.method2(input));
    }
}
