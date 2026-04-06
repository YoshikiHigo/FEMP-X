package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11450DifferenceFindingTest {
    @Test
    void methodsHandleNineBytesDifferently() {
        ClonePair11450 clonePair = new ClonePair11450();
        byte[] bytes = {1, 0, 0, 0, 0, 0, 0, 0, 0};

        assertEquals(1L, clonePair.method1(bytes, 0, 9));
        assertEquals(0L, clonePair.method2(bytes, 0, 9));
    }
}
