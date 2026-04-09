package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1906NoDifferenceTest {

    private final ClonePair1906 subject = new ClonePair1906();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] shortBytes = {0x00, 0x0f, (byte) 0xff};
        assertEquals("000fff", subject.method1(shortBytes));
        assertEquals("000fff", subject.method2(shortBytes));

        byte[] longBytes = new byte[33];
        for (int i = 0; i < longBytes.length; i++) {
            longBytes[i] = (byte) i;
        }
        String expected = "000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f\n20";
        assertEquals(expected, subject.method1(longBytes));
        assertEquals(expected, subject.method2(longBytes));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null));
    }
}
