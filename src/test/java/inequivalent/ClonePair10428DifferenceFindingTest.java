package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10428DifferenceFindingTest {
    @Test
    void methodsCompareSameLengthStringsDifferently() {
        ClonePair10428 clonePair = new ClonePair10428();

        assertEquals(0, clonePair.method1("b", "a"));
        assertEquals(1, clonePair.method2("b", "a"));
    }
}
