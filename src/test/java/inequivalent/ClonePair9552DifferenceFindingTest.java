package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9552DifferenceFindingTest {
    @Test
    void methodsHandleOnlyNaNDifferently() {
        ClonePair9552 clonePair = new ClonePair9552();
        double[] values = {Double.NaN};

        assertEquals(-1, clonePair.method1(values));
        assertEquals(0, clonePair.method2(values));
    }
}
