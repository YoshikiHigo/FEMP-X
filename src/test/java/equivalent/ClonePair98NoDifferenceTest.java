package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair98NoDifferenceTest {

    private final ClonePair98 subject = new ClonePair98();

    @Test
    void noDifferenceFoundForRepresentativeReturnValuesAndSideEffects() {
        byte[] input1 = {9, 9, 1, 0, 0, 0, 2, 0, 0, 0};
        byte[] input2 = input1.clone();

        assertArrayEquals(new int[]{1, 2}, subject.method1(input1, 2, 8));
        assertArrayEquals(new int[]{1, 2}, subject.method2(input2, 2, 8));
        assertArrayEquals(input1, input2);
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 0, 4));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 0, 4));

        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{1, 2, 3}, 0, 4));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{1, 2, 3}, 0, 4));
    }
}
