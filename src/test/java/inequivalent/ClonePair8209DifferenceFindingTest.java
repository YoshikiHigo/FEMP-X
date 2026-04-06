package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair8209DifferenceFindingTest {
    @Test
    void methodsDivideVarianceByDifferentCounts() {
        ClonePair8209 clonePair = new ClonePair8209();
        Number[] state = {0.0, 1L, 1.0, 0.0};

        assertArrayEquals(new Number[]{0.5, 2L, 3.0, 0.5}, clonePair.method1(state, 2));
        assertArrayEquals(new Number[]{0.25, 2L, 3.0, 0.5}, clonePair.method2(state, 2));
    }
}
