package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7918DifferenceFindingTest {
    @Test
    void methodsCompareCaseDifferently() {
        ClonePair7918 clonePair = new ClonePair7918();

        assertEquals(0, clonePair.method1("a", "A", true));
        assertEquals(32, clonePair.method2("a", "A", true));
    }
}
