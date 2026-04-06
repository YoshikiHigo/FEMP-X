package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8121DifferenceFindingTest {
    @Test
    void methodsHandleNullRowsDifferently() {
        ClonePair8121 clonePair = new ClonePair8121();
        int[][] left = {null};
        int[][] right = {null};

        assertThrows(NullPointerException.class, () -> clonePair.method1(left, right));
        assertTrue(clonePair.method2(left, right));
    }
}
