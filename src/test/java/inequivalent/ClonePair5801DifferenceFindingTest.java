package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair5801DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5801 clonePair = new ClonePair5801();

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> clonePair.method1(new byte[]{1}, Integer.MAX_VALUE, new byte[]{1}, 0, 1));
        assertTrue(clonePair.method2(new byte[]{1}, Integer.MAX_VALUE, new byte[]{1}, 0, 1));
    }
}
