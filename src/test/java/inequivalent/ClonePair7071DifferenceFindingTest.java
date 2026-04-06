package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7071DifferenceFindingTest {
    @Test
    void methodsHandleShortBuffersDifferently() {
        ClonePair7071 clonePair = new ClonePair7071();
        byte[] input = {1};

        assertEquals(0, clonePair.method1(input, 0));
        assertEquals(1, clonePair.method2(input, 0));
    }
}
