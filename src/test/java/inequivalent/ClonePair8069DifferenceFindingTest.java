package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8069DifferenceFindingTest {
    @Test
    void methodsUseDifferentHexCase() {
        ClonePair8069 clonePair = new ClonePair8069();
        byte[] input = {(byte) 0xab};

        assertEquals("ab", clonePair.method1(input, 0, 1));
        assertEquals("AB", clonePair.method2(input, 0, 1));
    }
}
