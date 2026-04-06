package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9955DifferenceFindingTest {
    @Test
    void methodsComputeDifferentByteAggregates() {
        ClonePair9955 clonePair = new ClonePair9955();
        byte[] bytes = {1, 2};

        assertEquals(63, clonePair.method1(bytes, 0, 2));
        assertEquals(3, clonePair.method2(bytes, 0, 2));
    }
}
