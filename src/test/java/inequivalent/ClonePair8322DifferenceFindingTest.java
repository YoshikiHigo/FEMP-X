package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClonePair8322DifferenceFindingTest {
    @Test
    void methodsApplyAndRemoveDistortionDifferently() {
        ClonePair8322 clonePair = new ClonePair8322();
        double[] input = {1.0, 0.0};
        double[] coefficients = {1.0, 0.0, 0.0, 0.0};

        assertNotEquals(2.0, clonePair.method1(input, coefficients)[0]);
        assertEquals(2.0, clonePair.method2(input, coefficients)[0]);
    }
}
