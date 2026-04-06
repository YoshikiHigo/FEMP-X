package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10556DifferenceFindingTest {
    @Test
    void methodsInterpretLengthDifferently() {
        ClonePair10556 clonePair = new ClonePair10556();
        byte[] data = {1, 0, 2, 0};

        assertEquals(1, clonePair.method1(data, 0, 2));
        assertEquals(2, clonePair.method2(data, 0, 2));
    }
}
