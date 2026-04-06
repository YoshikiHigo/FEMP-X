package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair5464DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5464 clonePair = new ClonePair5464();

        assertArrayEquals(new long[]{1L, 4L}, clonePair.method1(1, 1, 1, new long[]{1L, 2L}, new long[]{1L, 2L}));
        assertArrayEquals(new long[]{1L, 0L}, clonePair.method2(1, 1, 1, new long[]{1L, 2L}, new long[]{1L, 2L}));
    }
}
