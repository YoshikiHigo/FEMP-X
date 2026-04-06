package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair2DifferenceFindingTest {

    private static final double DELTA = 1.0e-9;

    private final ClonePair2 subject = new ClonePair2();

    @Test
    void methodsReturnDifferentDistancesWhenDifferencesAreSpreadAcrossElements() {
        Integer[] curr = {1, 1};
        Integer[] orig = {0, 0};

        assertEquals(2.0, subject.method1(curr, orig, 1, 1), DELTA);
        assertEquals(Math.sqrt(2.0), subject.method2(curr, orig, 1, 1), DELTA);
    }
}
