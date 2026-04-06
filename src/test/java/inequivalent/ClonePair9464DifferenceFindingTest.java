package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9464DifferenceFindingTest {
    @Test
    void methodsCompareCaseOnlyDifferenceDifferently() {
        ClonePair9464 clonePair = new ClonePair9464();

        assertEquals(0, clonePair.method1("a", "A"));
        assertEquals(32, clonePair.method2("a", "A"));
    }
}
