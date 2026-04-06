package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7201DifferenceFindingTest {
    @Test
    void methodsAggregateByProductAndSumDifferently() {
        ClonePair7201 clonePair = new ClonePair7201();
        int[] input = {2, 3};

        assertEquals(6L, clonePair.method1(0, 2, input));
        assertEquals(5L, clonePair.method2(0, 2, input));
    }
}
