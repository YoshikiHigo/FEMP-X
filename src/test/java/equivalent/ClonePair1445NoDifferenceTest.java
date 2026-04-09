package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1445NoDifferenceTest {

    private final ClonePair1445 subject = new ClonePair1445();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] bytes = {0x00, 0x0f, 0x10, 0x7f, (byte) 0x80, (byte) 0xff};
        assertEquals("000f107f80ff", subject.method1(bytes));
        assertEquals("000f107f80ff", subject.method2(bytes));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null));
    }
}
