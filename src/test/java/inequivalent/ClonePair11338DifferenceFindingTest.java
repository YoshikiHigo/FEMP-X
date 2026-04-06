package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11338DifferenceFindingTest {
    @Test
    void methodsAggregateValuesDifferently() {
        ClonePair11338 clonePair = new ClonePair11338();
        double[] values = {2.0, 3.0};

        assertEquals(5.0, clonePair.method1(0, 2, values), 0.0);
        assertEquals(6.0, clonePair.method2(0, 2, values), 0.0);
    }
}
