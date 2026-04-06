package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8190DifferenceFindingTest {
    @Test
    void methodsSkipTabsDifferently() {
        ClonePair8190 clonePair = new ClonePair8190();

        assertEquals(0, clonePair.method1("\t", 0, 1));
        assertEquals(1, clonePair.method2("\t", 0, 1));
    }
}
