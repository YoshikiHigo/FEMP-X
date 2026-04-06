package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5822DifferenceFindingTest {
    @Test
    void onlyMethod2AccessesArrayWhenOffsetAdditionOverflows() {
        ClonePair5822 clonePair = new ClonePair5822();
        byte[] a = {1};
        byte[] b = {1};

        assertTrue(clonePair.method1(a, Integer.MAX_VALUE, b, 0, 1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> clonePair.method2(a, Integer.MAX_VALUE, b, 0, 1));
    }
}
