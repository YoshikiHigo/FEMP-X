package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10973DifferenceFindingTest {
    @Test
    void methodsEncodeEuroSignDifferently() {
        ClonePair10973 clonePair = new ClonePair10973();

        assertEquals((byte) -128, clonePair.method1('\u20AC'));
        assertEquals((byte) 7, clonePair.method2('\u20AC'));
    }
}
