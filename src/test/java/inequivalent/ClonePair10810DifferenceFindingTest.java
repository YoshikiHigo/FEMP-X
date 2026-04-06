package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10810DifferenceFindingTest {
    @Test
    void methodsCompareNumericStringsDifferently() {
        ClonePair10810 clonePair = new ClonePair10810();

        assertEquals(-1, clonePair.method1("2", "10"));
        assertEquals(1, clonePair.method2("2", "10"));
    }
}
