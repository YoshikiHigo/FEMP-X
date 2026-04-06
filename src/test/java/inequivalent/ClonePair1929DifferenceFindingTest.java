package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1929DifferenceFindingTest {

    private final ClonePair1929 subject = new ClonePair1929();

    @Test
    void methodsHandleOutOfRangeNumberDifferently() {
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1(128));
        assertEquals((byte) -128, subject.method2(128));
    }
}
