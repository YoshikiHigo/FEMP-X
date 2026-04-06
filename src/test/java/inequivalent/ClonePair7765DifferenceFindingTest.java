package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7765DifferenceFindingTest {
    @Test
    void methodsDecodeDifferentElementWidths() {
        ClonePair7765 clonePair = new ClonePair7765();
        byte[] input = {0, 0, 0, 1};

        assertEquals(0, ((long[]) clonePair.method1(input)).length);
        assertArrayEquals(new int[]{1}, (int[]) clonePair.method2(input));
    }
}
