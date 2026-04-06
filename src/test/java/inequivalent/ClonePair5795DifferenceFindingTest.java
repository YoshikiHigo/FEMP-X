package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair5795DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5795 clonePair = new ClonePair5795();

        assertFalse(clonePair.method1(new byte[]{1}, Integer.MAX_VALUE, new byte[]{1}, 0, 1));
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> clonePair.method2(new byte[]{1}, Integer.MAX_VALUE, new byte[]{1}, 0, 1));
    }
}
