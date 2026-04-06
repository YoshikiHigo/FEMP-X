package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11305DifferenceFindingTest {
    @Test
    void methodsCompareDifferentFloatingWidths() {
        ClonePair11305 clonePair = new ClonePair11305();

        assertEquals(16777217, clonePair.method1(16777216, 16777217).intValue());
        assertEquals(16777216, clonePair.method2(16777216, 16777217).intValue());
    }
}
