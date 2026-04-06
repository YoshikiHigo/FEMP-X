package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9237DifferenceFindingTest {
    @Test
    void methodsStartAtDifferentPositions() {
        ClonePair9237 clonePair = new ClonePair9237();

        assertEquals(2, clonePair.method1("ab cd", 2, null));
        assertEquals(3, clonePair.method2("ab cd", 2, null));
    }
}
