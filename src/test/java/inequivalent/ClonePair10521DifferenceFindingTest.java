package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10521DifferenceFindingTest {
    @Test
    void methodsComputeDifferentByteAggregates() {
        ClonePair10521 clonePair = new ClonePair10521();
        byte[] bytes = {1, 2};

        assertEquals(33, clonePair.method1(bytes, 0, 2));
        assertEquals(3, clonePair.method2(bytes, 0, 2));
    }
}
