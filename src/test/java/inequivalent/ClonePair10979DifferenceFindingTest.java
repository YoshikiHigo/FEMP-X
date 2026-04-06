package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10979DifferenceFindingTest {
    @Test
    void methodsHandleOverlappingBytePatternDifferently() {
        ClonePair10979 clonePair = new ClonePair10979();
        byte[] array = {1, 1, 2};
        byte[] pattern = {1, 2};

        assertEquals(-1, clonePair.method1(array, pattern, 0));
        assertEquals(1, clonePair.method2(array, pattern, 0));
    }
}
