package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair3186DifferenceFindingTest {

    private final ClonePair3186 subject = new ClonePair3186();

    @Test
    void methodsMutateTargetRangeDifferently() {
        short[] method1Input = {1, 2};
        short[] method2Input = {1, 2};

        assertArrayEquals(new short[]{1, 1}, subject.method1(1, 1, method1Input, (short) -1));
        assertArrayEquals(new short[]{1, -2}, subject.method2(1, 1, method2Input, (short) -1));
    }
}
