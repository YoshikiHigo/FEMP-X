package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair5885DifferenceFindingTest {
    @Test
    void onlyMethod1OverflowsEndBeforeSearching() {
        ClonePair5885 clonePair = new ClonePair5885();
        int[] values = {1};

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> clonePair.method1(values, 1, 0, Integer.MIN_VALUE));
        assertEquals(-1, clonePair.method2(values, 1, 0, Integer.MIN_VALUE));
    }
}
