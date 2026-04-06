package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10321DifferenceFindingTest {
    @Test
    void methodsHandleFiveByteIntegerDifferently() {
        ClonePair10321 clonePair = new ClonePair10321();
        byte[] data = {1, 2, 3, 4, 4};

        assertEquals(33752068, clonePair.method1(data, 0, 5));
        assertEquals(33752069, clonePair.method2(data, 0, 5));
    }
}
