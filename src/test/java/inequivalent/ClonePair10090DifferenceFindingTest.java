package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10090DifferenceFindingTest {
    @Test
    void methodsComputeDifferentByteAggregates() {
        ClonePair10090 clonePair = new ClonePair10090();
        byte[] bytes = {1, 2};

        assertEquals(258, clonePair.method1(bytes, 0, 2));
        assertEquals(3, clonePair.method2(bytes, 0, 2));
    }
}
