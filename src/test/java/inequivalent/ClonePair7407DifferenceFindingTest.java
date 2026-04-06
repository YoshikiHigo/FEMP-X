package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7407DifferenceFindingTest {
    @Test
    void methodsPadRightAndCenterDifferently() {
        ClonePair7407 clonePair = new ClonePair7407();

        assertEquals("a__", clonePair.method1("a", 3, '_'));
        assertEquals("_a_", clonePair.method2("a", 3, '_'));
    }
}
