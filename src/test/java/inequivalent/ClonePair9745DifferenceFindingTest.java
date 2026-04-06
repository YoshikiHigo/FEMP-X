package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9745DifferenceFindingTest {
    @Test
    void method2SortsArgumentButMethod1DoesNot() {
        ClonePair9745 clonePair = new ClonePair9745();
        int[] method1Values = {2, 1};
        int[] method2Values = {2, 1};

        assertEquals(1, clonePair.method1(method1Values));
        assertEquals(1, clonePair.method2(method2Values));

        assertArrayEquals(new int[]{2, 1}, method1Values);
        assertArrayEquals(new int[]{1, 2}, method2Values);
    }
}
