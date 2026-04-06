package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8326DifferenceFindingTest {
    @Test
    void methodsStartScanningAtDifferentOffsets() {
        ClonePair8326 clonePair = new ClonePair8326();

        assertEquals(1, clonePair.method1(")", 0));
        assertEquals(-1, clonePair.method2(")", 0));
    }
}
