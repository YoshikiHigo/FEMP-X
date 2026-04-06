package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair11413DifferenceFindingTest {
    @Test
    void methodsHandleNineBytesDifferently() {
        ClonePair11413 clonePair = new ClonePair11413();
        byte[] bytes = {1, 0, 0, 0, 0, 0, 0, 0, 1};

        assertEquals(2L, clonePair.method1(bytes, 0, 9));
        assertEquals(1L, clonePair.method2(bytes, 0, 9));
    }
}
