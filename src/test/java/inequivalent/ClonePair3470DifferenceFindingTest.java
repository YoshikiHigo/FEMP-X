package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3470DifferenceFindingTest {

    private final ClonePair3470 subject = new ClonePair3470();

    @Test
    void methodsTreatDottedCapitalIComparisonDifferently() {
        assertEquals(0, subject.method1("\u0130", "i"));
        assertEquals(1, subject.method2("\u0130", "i"));
    }
}
