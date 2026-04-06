package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12286DifferenceFindingTest {
    @Test
    void methodsShiftNegativeValuesDifferently() {
        ClonePair12286 clonePair = new ClonePair12286();

        assertEquals(4L, clonePair.method1(-8L, -4L));
        assertEquals(-4L, clonePair.method2(-8L, -4L));
    }
}
