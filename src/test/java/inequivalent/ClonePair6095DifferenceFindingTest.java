package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6095DifferenceFindingTest {
    @Test
    void methodsComputeDifferentIntegerResults() {
        ClonePair6095 clonePair = new ClonePair6095();

        assertEquals(3, clonePair.method1(2, 3));
        assertEquals(1, clonePair.method2(2, 3));
    }
}
