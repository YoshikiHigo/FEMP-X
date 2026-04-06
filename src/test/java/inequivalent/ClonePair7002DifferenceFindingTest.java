package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7002DifferenceFindingTest {
    @Test
    void methodsHandleValueAboveUpperBoundDifferently() {
        ClonePair7002 clonePair = new ClonePair7002();

        assertEquals(2, clonePair.method1(0, 1, 2));
        assertEquals(1, clonePair.method2(0, 1, 2));
    }
}
