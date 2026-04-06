package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5381DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair5381 clonePair = new ClonePair5381();

        assertEquals(-255, clonePair.method1(new byte[]{0x24, 0x02}, new byte[]{0x25, 0x01}, true));
        assertEquals(1, clonePair.method2(new byte[]{0x24, 0x02}, new byte[]{0x25, 0x01}, true));
    }
}
