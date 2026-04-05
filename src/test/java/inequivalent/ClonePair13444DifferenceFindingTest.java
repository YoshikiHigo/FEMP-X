package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair13444DifferenceFindingTest {

    private final ClonePair13444 subject = new ClonePair13444();

    @Test
    void methodsReturnDifferentValuesForOddLengthHexString() {
        assertArrayEquals(new byte[]{0, 16}, subject.method1("010"));
        assertArrayEquals(new byte[]{1, 0}, subject.method2("010"));
    }
}
