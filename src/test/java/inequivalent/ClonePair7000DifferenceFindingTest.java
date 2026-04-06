package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7000DifferenceFindingTest {
    @Test
    void methodsShiftSubsequentBytesDifferently() {
        ClonePair7000 clonePair = new ClonePair7000();
        byte[] input = {0, 1};

        assertEquals(65_536, clonePair.method1(input, 0));
        assertEquals(1_048_576, clonePair.method2(input, 0));
    }
}
