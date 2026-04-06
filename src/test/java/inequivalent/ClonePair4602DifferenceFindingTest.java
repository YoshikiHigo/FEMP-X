package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair4602DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4602 clonePair = new ClonePair4602();

        double[] method1Data = {2.0, 1.0};
        double[] method2Data = {2.0, 1.0};

        assertEquals(1.5, clonePair.method1(method1Data));
        assertArrayEquals(new double[]{1.0, 2.0}, method1Data);
        assertEquals(1.5, clonePair.method2(method2Data));
        assertArrayEquals(new double[]{2.0, 1.0}, method2Data);
    }
}
