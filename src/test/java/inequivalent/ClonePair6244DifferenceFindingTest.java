package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6244DifferenceFindingTest {
    @Test
    void methodsAggregateArrayValuesDifferently() {
        ClonePair6244 clonePair = new ClonePair6244();
        long[] values = {2L, 3L};

        assertEquals(6L, clonePair.method1(0, 2, values));
        assertEquals(5L, clonePair.method2(0, 2, values));
    }
}
