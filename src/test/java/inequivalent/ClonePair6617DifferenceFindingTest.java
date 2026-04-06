package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6617DifferenceFindingTest {
    @Test
    void methodsRoundNegativeHalfValuesDifferently() {
        ClonePair6617 clonePair = new ClonePair6617();

        assertEquals(-1.3, clonePair.method1(-1.25, 1), 0.0);
        assertEquals(-1.2, clonePair.method2(-1.25, 1), 0.0);
    }
}
