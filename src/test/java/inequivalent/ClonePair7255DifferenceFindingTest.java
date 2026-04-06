package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7255DifferenceFindingTest {
    @Test
    void methodsReturnLastAndFirstMatchingIndexes() {
        ClonePair7255 clonePair = new ClonePair7255();

        assertEquals(2, clonePair.method1("aba", 'a'));
        assertEquals(0, clonePair.method2("aba", 'a'));
    }
}
