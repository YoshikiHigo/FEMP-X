package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3121DifferenceFindingTest {

    private final ClonePair3121 subject = new ClonePair3121();

    @Test
    void methodsTreatDegreesMinutesSecondsDifferently() {
        assertEquals(1.0341666666666667, subject.method1("1*2#3"));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2("1*2#3"));
    }
}
