package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClonePair9179DifferenceFindingTest {
    @Test
    void methodsSaturateAtDifferentThresholds() {
        ClonePair9179 clonePair = new ClonePair9179();

        assertEquals(1.0, clonePair.method1(6.0));
        assertNotEquals(1.0, clonePair.method2(6.0));
    }
}
