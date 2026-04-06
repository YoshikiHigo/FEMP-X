package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4487DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4487 clonePair = new ClonePair4487();

        double[] values = {Double.NaN};

        assertTrue(Double.isNaN(clonePair.method1(values)));
        assertEquals(Double.MAX_VALUE, clonePair.method2(values));
    }
}
