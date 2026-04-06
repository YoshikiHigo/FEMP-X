package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7733DifferenceFindingTest {
    @Test
    void methodsHandleZeroAndNegativeInputDifferently() {
        ClonePair7733 clonePair = new ClonePair7733();

        assertEquals(-1, clonePair.method1(0, -1));
        assertEquals(1, clonePair.method2(0, -1));
    }
}
