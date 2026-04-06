package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7439DifferenceFindingTest {
    @Test
    void methodsPadOppositeSides() {
        ClonePair7439 clonePair = new ClonePair7439();

        assertEquals("__a", clonePair.method1("a", 3, '_'));
        assertEquals("a\u0000_", clonePair.method2("a", 3, '_'));
    }
}
