package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12468DifferenceFindingTest {
    @Test
    void methodsFindDifferentTokenStartPositions() {
        ClonePair12468 clonePair = new ClonePair12468();

        assertEquals(2, clonePair.method1("a b", 3));
        assertEquals(0, clonePair.method2("a b", 3));
    }
}
