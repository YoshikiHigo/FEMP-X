package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair922NoDifferenceTest {

    private final ClonePair922 subject = new ClonePair922();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] bytes = {0x00, 0x0f, (byte) 0xff};
        assertEquals("00_0f_ff", subject.method1(bytes, 0));
        assertEquals("00_0f_ff", subject.method2(bytes, 0));

        assertEquals("0f_ff", subject.method1(bytes, 1));
        assertEquals("0f_ff", subject.method2(bytes, 1));

        assertEquals("", subject.method1(bytes, bytes.length));
        assertEquals("", subject.method2(bytes, bytes.length));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{1}, -1));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{1}, -1));

        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 0));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 0));
    }
}
