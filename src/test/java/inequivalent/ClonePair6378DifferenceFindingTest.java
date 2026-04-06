package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6378DifferenceFindingTest {
    @Test
    void methodsPrioritizeLengthAndElementComparisonDifferently() {
        ClonePair6378 clonePair = new ClonePair6378();

        assertEquals(-1, clonePair.method1(new int[]{2}, new int[]{1, 3}));
        assertEquals(1, clonePair.method2(new int[]{2}, new int[]{1, 3}));
    }
}
