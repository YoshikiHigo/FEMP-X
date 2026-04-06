package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6742DifferenceFindingTest {
    @Test
    void onlyMethod1TreatsBytesAsUnsigned() {
        ClonePair6742 clonePair = new ClonePair6742();
        byte[] bytes = new byte[8];
        bytes[7] = -1;

        assertEquals(255L, clonePair.method1(bytes));
        assertEquals(-1L, clonePair.method2(bytes));
    }
}
