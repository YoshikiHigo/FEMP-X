package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair7889DifferenceFindingTest {
    @Test
    void methodsHandleNaNChannelsDifferently() {
        ClonePair7889 clonePair = new ClonePair7889();
        double[][] input = {{Double.NaN}, {1.0}};

        assertTrue(Double.isNaN(clonePair.method1(input)[0]));
        assertArrayEquals(new double[]{1.0}, clonePair.method2(input));
    }
}
