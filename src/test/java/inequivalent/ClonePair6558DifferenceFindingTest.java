package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6558DifferenceFindingTest {
    @Test
    void onlyMethod2TruncatesDoubleDifferenceBeforeComparing() {
        ClonePair6558 clonePair = new ClonePair6558();
        double[] values = {0.5};

        assertEquals(-1, clonePair.method1(values, 0.0));
        assertEquals(0, clonePair.method2(values, 0.0));
    }
}
