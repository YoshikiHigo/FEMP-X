package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ClonePair9398DifferenceFindingTest {
    @Test
    void methodsFlipRowsAndBlurPixelsDifferently() {
        ClonePair9398 clonePair = new ClonePair9398();
        int[] input = {1, 2, 3, 4};

        assertArrayEquals(new int[]{3, 4, 1, 2}, clonePair.method1(input, 2, 2));
        assertFalse(Arrays.equals(clonePair.method1(input, 2, 2), clonePair.method2(input, 2, 2)));
    }
}
