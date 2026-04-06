package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7435DifferenceFindingTest {
    @Test
    void methodsHandleTrailingZerosBeyondFifteenBitsDifferently() {
        ClonePair7435 clonePair = new ClonePair7435();

        assertEquals(15, clonePair.method1(65_536));
        assertEquals(16, clonePair.method2(65_536));
    }
}
