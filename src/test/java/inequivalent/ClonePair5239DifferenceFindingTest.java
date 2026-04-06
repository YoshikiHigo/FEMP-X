package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.vectorOfDoubles;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5239DifferenceFindingTest {

    private final ClonePair5239 subject = new ClonePair5239();

    @Test
    void methodsReturnDifferentMatchingPositionsForMiddleThreshold() {
        assertEquals(1, subject.method1(vectorOfDoubles(-1.0, 0.0, 1.0), 0.5));
        assertEquals(2, subject.method2(vectorOfDoubles(-1.0, 0.0, 1.0), 0.5));
    }
}
