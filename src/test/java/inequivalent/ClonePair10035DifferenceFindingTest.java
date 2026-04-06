package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10035DifferenceFindingTest {
    @Test
    void methodsHandleFiveByteIntegerDifferently() {
        ClonePair10035 clonePair = new ClonePair10035();
        byte[] data = {1, 2, 3, 4, 5};

        assertEquals(33752070, clonePair.method1(data, 0, 5));
        assertEquals(33752069, clonePair.method2(data, 0, 5));
    }
}
