package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7960DifferenceFindingTest {
    @Test
    void methodsRemoveAllWhitespaceAndTrimEdgesDifferently() {
        ClonePair7960 clonePair = new ClonePair7960();
        char[] input = {'a', ' ', 'b'};

        assertEquals("ab", clonePair.method1(input, 0, 3));
        assertEquals("a b", clonePair.method2(input, 0, 3));
    }
}
