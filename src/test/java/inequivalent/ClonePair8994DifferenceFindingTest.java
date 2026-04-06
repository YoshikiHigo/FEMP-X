package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8994DifferenceFindingTest {
    @Test
    void methodsCheckDifferentMatrixSizes() {
        ClonePair8994 clonePair = new ClonePair8994();
        double[][] input = {
                {1.0, 0.0, 0.0},
                {0.0, 1.0, 0.0},
                {0.0, 0.0, 2.0}
        };

        assertFalse(clonePair.method1(input));
        assertTrue(clonePair.method2(input));
    }
}
