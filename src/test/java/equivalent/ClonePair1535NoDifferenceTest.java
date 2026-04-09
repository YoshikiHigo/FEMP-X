package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1535NoDifferenceTest {

    private final ClonePair1535 subject = new ClonePair1535();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] a = new byte[16];
        byte[] b = new byte[16];
        for (int i = 0; i < 16; i++) {
            a[i] = (byte) i;
            b[i] = (byte) i;
        }
        assertTrue(subject.method1(a, b));
        assertTrue(subject.method2(a, b));

        b[15] = 99;
        assertFalse(subject.method1(a, b));
        assertFalse(subject.method2(a, b));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[15], new byte[16]));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[15], new byte[16]));
    }
}
