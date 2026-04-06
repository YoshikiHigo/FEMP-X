package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12304DifferenceFindingTest {
    @Test
    void methodsHandleZeroOperandDifferently() {
        ClonePair12304 clonePair = new ClonePair12304();

        assertEquals(0L, clonePair.method1(0L, 5L));
        assertEquals(5L, clonePair.method2(0L, 5L));
    }
}
