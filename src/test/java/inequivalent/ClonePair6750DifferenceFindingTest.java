package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6750DifferenceFindingTest {
    @Test
    void onlyMethod2CastsHighBytesBeforeShifting() {
        ClonePair6750 clonePair = new ClonePair6750();
        byte[] bytes = new byte[8];
        bytes[4] = 1;

        assertEquals(1L, clonePair.method1(bytes));
        assertEquals(4294967296L, clonePair.method2(bytes));
    }
}
