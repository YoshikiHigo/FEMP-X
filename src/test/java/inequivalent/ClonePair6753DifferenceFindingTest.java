package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6753DifferenceFindingTest {
    @Test
    void methodsComputeDifferentCounts() {
        ClonePair6753 clonePair = new ClonePair6753();

        assertEquals(24, clonePair.method1(2, 3, 4));
        assertEquals(3, clonePair.method2(2, 3, 4));
    }
}
