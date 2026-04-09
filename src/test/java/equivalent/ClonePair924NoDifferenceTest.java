package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair924NoDifferenceTest {

    private final ClonePair924 subject = new ClonePair924();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] bytes = {0x00, 0x0f, (byte) 0xff};
        assertEquals("000fff", subject.method1(bytes, 3));
        assertEquals("000fff", subject.method2(bytes, 3));

        assertEquals("", subject.method1(bytes, 0));
        assertEquals("", subject.method2(bytes, 0));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{1}, 2));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{1}, 2));

        assertEquals("", subject.method1(null, 0));
        assertEquals("", subject.method2(null, 0));

        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 1));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 1));
    }
}
