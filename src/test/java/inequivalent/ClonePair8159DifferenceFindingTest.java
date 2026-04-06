package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8159DifferenceFindingTest {
    @Test
    void methodsWritePackedAndRepeatedValuesDifferently() {
        ClonePair8159 clonePair = new ClonePair8159();
        int[] method1Output = new int[4];
        int[] method2Output = new int[4];

        assertEquals(1, clonePair.method1("\u0002a", 0, method1Output));
        assertEquals(2, clonePair.method2("\u0002a", 0, method2Output));
        assertArrayEquals(new int[]{131_169, 0, 0, 0}, method1Output);
        assertArrayEquals(new int[]{'a', 'a', 0, 0}, method2Output);
    }
}
