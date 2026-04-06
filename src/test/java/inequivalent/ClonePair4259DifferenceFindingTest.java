package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4259DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4259 clonePair = new ClonePair4259();

        float[] left = {Float.NaN};
        float[] right = {Float.NaN};

        assertTrue(clonePair.method1(left, right));
        assertFalse(clonePair.method2(left, right));
    }
}
