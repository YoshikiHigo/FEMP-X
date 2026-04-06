package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7493DifferenceFindingTest {
    @Test
    void methodsReturnMeanAndMaximumDifferently() {
        ClonePair7493 clonePair = new ClonePair7493();

        assertEquals(2.0, clonePair.method1(Arrays.asList(1.0, 3.0)));
        assertEquals(3.0, clonePair.method2(Arrays.asList(1.0, 3.0)));
    }
}
