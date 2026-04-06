package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4244DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4244 clonePair = new ClonePair4244();

        float[] left = {1.0f};
        float[] right = {1.05f};

        assertTrue(clonePair.method1(left, right));
        assertFalse(clonePair.method2(left, right));
    }
}
