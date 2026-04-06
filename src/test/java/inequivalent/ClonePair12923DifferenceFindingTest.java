package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12923DifferenceFindingTest {
    @Test
    void methodsAccumulateBytesDifferently() {
        ClonePair12923 clonePair = new ClonePair12923();
        byte[] bytes = {1, 2};

        assertEquals(3, clonePair.method1(bytes, 0, bytes.length));
        assertEquals(39, clonePair.method2(bytes, 0, bytes.length));
    }
}
