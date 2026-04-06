package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8670DifferenceFindingTest {
    @Test
    void methodsSkipTabsDifferently() {
        ClonePair8670 clonePair = new ClonePair8670();

        assertEquals(1, clonePair.method1("\t", 0));
        assertEquals(0, clonePair.method2("\t", 0));
    }
}
