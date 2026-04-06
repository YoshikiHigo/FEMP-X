package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8265DifferenceFindingTest {
    @Test
    void methodsCastSearchCharacterDifferently() {
        ClonePair8265 clonePair = new ClonePair8265();
        byte[] input = {0};

        assertEquals(-1, clonePair.method1(input, 0, 1, (char) 256));
        assertEquals(0, clonePair.method2(input, 0, 1, (char) 256));
    }
}
