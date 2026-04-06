package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5906DifferenceFindingTest {
    @Test
    void methodsCountDifferentDivisorProperties() {
        ClonePair5906 clonePair = new ClonePair5906();

        assertEquals(1, clonePair.method1(6, 2));
        assertEquals(3, clonePair.method2(6, 2));
    }
}
