package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair8906DifferenceFindingTest {
    @Test
    void methodsPadOppositeSides() {
        ClonePair8906 clonePair = new ClonePair8906();
        byte[] input = {1};

        assertArrayEquals(new byte[]{1, 0}, clonePair.method1(input, 2));
        assertArrayEquals(new byte[]{0, 1}, clonePair.method2(input, 2));
    }
}
