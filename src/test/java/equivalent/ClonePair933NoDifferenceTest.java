package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair933NoDifferenceTest {

    private final ClonePair933 subject = new ClonePair933();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] fullRow = {65, 66, 67, 68, 69, 70, 71, 72};
        String fullRowExpected = "41 42 43 44 45 46 47 48     A B C D E F G H \n" +
                "                            \n";
        assertEquals(fullRowExpected, subject.method1(fullRow, 8));
        assertEquals(fullRowExpected, subject.method2(fullRow, 8));

        byte[] partial = {65, 10, (byte) 0xff};
        String partialExpected = "41 0a ff                    A . . \n";
        assertEquals(partialExpected, subject.method1(partial, 3));
        assertEquals(partialExpected, subject.method2(partial, 3));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 1));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 1));

        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{1}, 2));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{1}, 2));
    }
}
