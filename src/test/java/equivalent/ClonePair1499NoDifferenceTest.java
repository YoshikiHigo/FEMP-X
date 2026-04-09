package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair1499NoDifferenceTest {

    private final ClonePair1499 subject = new ClonePair1499();

    @Test
    void noDifferenceFoundForRepresentativeReturnValuesAndSideEffects() {
        byte[] shortInput1 = {0, 0, 0, 0, 0, 0, 0, 1};
        byte[] shortInput2 = shortInput1.clone();
        assertArrayEquals(new long[]{1L}, subject.method1(shortInput1, 0, 8));
        assertArrayEquals(new long[]{1L}, subject.method2(shortInput2, 0, 8));
        assertArrayEquals(shortInput1, shortInput2);

        byte[] longInput1 = new byte[64];
        byte[] longInput2 = new byte[64];
        for (int i = 0; i < 8; i++) {
            longInput1[i * 8 + 7] = (byte) (i + 1);
            longInput2[i * 8 + 7] = (byte) (i + 1);
        }
        assertArrayEquals(new long[]{1, 2, 3, 4, 5, 6, 7, 8}, subject.method1(longInput1, 0, 64));
        assertArrayEquals(new long[]{1, 2, 3, 4, 5, 6, 7, 8}, subject.method2(longInput2, 0, 64));
        assertArrayEquals(longInput1, longInput2);
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{0}, 0, 8));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{0}, 0, 8));
    }
}
