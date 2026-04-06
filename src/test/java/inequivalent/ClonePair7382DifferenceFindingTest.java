package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7382DifferenceFindingTest {
    @Test
    void methodsPadOppositeSides() {
        ClonePair7382 clonePair = new ClonePair7382();

        assertEquals("a__", clonePair.method1("a", 3, '_'));
        assertEquals("__a", clonePair.method2("a", 3, '_'));
    }
}
