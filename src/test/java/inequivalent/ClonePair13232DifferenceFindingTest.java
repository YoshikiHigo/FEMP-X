package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair13232DifferenceFindingTest {

    private final ClonePair13232 subject = new ClonePair13232();

    @Test
    void methodsTreatTabOnlyInputDifferently() {
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1("\t"));
        assertEquals(0, subject.method2("\t"));
    }
}
