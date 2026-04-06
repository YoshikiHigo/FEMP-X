package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6789DifferenceFindingTest {
    @Test
    void onlyMethod2TreatsEndIndexAsInclusive() {
        ClonePair6789 clonePair = new ClonePair6789();
        int[] values = {1, 2};

        assertEquals(0, clonePair.method1(values, 0, 1));
        assertEquals(1, clonePair.method2(values, 0, 1));
    }
}
