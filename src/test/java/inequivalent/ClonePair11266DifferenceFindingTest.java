package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11266DifferenceFindingTest {
    @Test
    void methodsReturnDifferentMatchingIndexes() {
        ClonePair11266 clonePair = new ClonePair11266();
        int[] data = {1, 0, 1};

        assertEquals(0, clonePair.method1(data, 1));
        assertEquals(2, clonePair.method2(data, 1));
    }
}
