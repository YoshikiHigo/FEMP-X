package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair97NoDifferenceTest {

    private final ClonePair97 subject = new ClonePair97();

    @Test
    void noDifferenceFoundForRepresentativeReturnValuesAndSideEffects() {
        byte[] shortInput1 = {0, 0, 0, 1, 0, 0, 0, 2};
        byte[] shortInput2 = shortInput1.clone();
        assertArrayEquals(new int[]{1, 2}, subject.method1(shortInput1, 0, 8));
        assertArrayEquals(new int[]{1, 2}, subject.method2(shortInput2, 0, 8));
        assertArrayEquals(new byte[]{0, 0, 0, 1, 0, 0, 0, 2}, shortInput1);
        assertArrayEquals(new byte[]{0, 0, 0, 1, 0, 0, 0, 2}, shortInput2);

        byte[] longInput1 = {
                0, 0, 0, 1, 0, 0, 0, 2,
                0, 0, 0, 3, 0, 0, 0, 4,
                0, 0, 0, 5, 0, 0, 0, 6,
                0, 0, 0, 7, 0, 0, 0, 8
        };
        byte[] longInput2 = longInput1.clone();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, subject.method1(longInput1, 0, 32));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, subject.method2(longInput2, 0, 32));
        assertArrayEquals(longInput1, longInput2);
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 0, 4));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 0, 4));

        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{0, 0, 0}, 0, 4));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{0, 0, 0}, 0, 4));
    }
}
