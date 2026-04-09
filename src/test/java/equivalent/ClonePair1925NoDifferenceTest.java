package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1925NoDifferenceTest {

    private final ClonePair1925 subject = new ClonePair1925();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] bytes = {0x00, 0x0f, 0x10, 0x7f, (byte) 0x80, (byte) 0xff};
        assertEquals("000F107F80FF", subject.method1(bytes));
        assertEquals("000F107F80FF", subject.method2(bytes));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null));
    }
}
