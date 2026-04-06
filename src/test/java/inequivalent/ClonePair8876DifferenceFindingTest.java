package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair8876DifferenceFindingTest {
    @Test
    void methodsCopyInReverseAndForwardOrderDifferently() {
        ClonePair8876 clonePair = new ClonePair8876();
        byte[] input = {1, 2};

        assertArrayEquals(new byte[]{2, 1}, clonePair.method1(input, 0, 2));
        assertArrayEquals(new byte[]{1, 2}, clonePair.method2(input, 0, 2));
    }
}
