package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3495DifferenceFindingTest {

    private final ClonePair3495 subject = new ClonePair3495();

    @Test
    void methodsHandleLongArgumentsDifferently() {
        assertThrowsByName("java.lang.ClassCastException", () -> subject.method1(1L, 2L));
        assertEquals(-1, subject.method2(1L, 2L));
    }
}
