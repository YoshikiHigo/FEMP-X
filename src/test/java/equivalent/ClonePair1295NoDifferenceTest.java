package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1295NoDifferenceTest {

    private final ClonePair1295 subject = new ClonePair1295();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] bytes = {0x00, 0x41, 0x30, 0x42};
        assertEquals("A\u3042", subject.method1(bytes));
        assertEquals("A\u3042", subject.method2(bytes));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{0x00}));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{0x00}));

        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null));
    }
}
