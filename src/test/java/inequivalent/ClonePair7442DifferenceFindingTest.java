package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7442DifferenceFindingTest {
    @Test
    void methodsPadOppositeSides() {
        ClonePair7442 clonePair = new ClonePair7442();

        assertEquals("a__", clonePair.method1("a", 3, '_'));
        assertEquals("__a", clonePair.method2("a", 3, '_'));
    }
}
