package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1640DifferenceFindingTest {

    private final ClonePair1640 subject = new ClonePair1640();

    @Test
    void methodsHandleDoubleNumberDifferently() {
        assertEquals(1, subject.method1(1.5));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2(1.5));
    }
}
