package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair1175NoDifferenceTest {

    private final ClonePair1175 subject = new ClonePair1175();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] a = new byte[16];
        byte[] b = new byte[20];
        for (int i = 0; i < 16; i++) {
            a[i] = (byte) i;
            b[i + 4] = (byte) i;
        }
        assertTrue(subject.method1(a, b));
        assertTrue(subject.method2(a, b));

        b[10] = 99;
        assertFalse(subject.method1(a, b));
        assertFalse(subject.method2(a, b));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[15], new byte[20]));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[15], new byte[20]));
    }
}
