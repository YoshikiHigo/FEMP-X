package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9877DifferenceFindingTest {
    @Test
    void methodsClampNearOneDifferently() {
        ClonePair9877 clonePair = new ClonePair9877();
        double input = 1.0 + 5.0e-11;

        assertEquals(input, clonePair.method1(input), 0.0);
        assertEquals(1.0, clonePair.method2(input), 0.0);
    }
}
