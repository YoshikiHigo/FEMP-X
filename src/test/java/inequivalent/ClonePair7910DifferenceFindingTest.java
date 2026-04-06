package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7910DifferenceFindingTest {
    @Test
    void methodsCompareCaseDifferently() {
        ClonePair7910 clonePair = new ClonePair7910();

        assertEquals(32, clonePair.method1("a", "A", false));
        assertEquals(0, clonePair.method2("a", "A", false));
    }
}
