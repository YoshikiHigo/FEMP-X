package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9650DifferenceFindingTest {
    @Test
    void methodsHandleNewlineDifferently() {
        ClonePair9650 clonePair = new ClonePair9650();

        assertEquals(0, clonePair.method1("\n", 1));
        assertEquals(1, clonePair.method2("\n", 1));
    }
}
