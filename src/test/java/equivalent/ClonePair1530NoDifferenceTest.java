package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1530NoDifferenceTest {

    private final ClonePair1530 subject = new ClonePair1530();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals("QQ==", subject.method1(new byte[]{'A'}));
        assertEquals("QQ==", subject.method2(new byte[]{'A'}));

        assertEquals("QUI=", subject.method1(new byte[]{'A', 'B'}));
        assertEquals("QUI=", subject.method2(new byte[]{'A', 'B'}));

        assertEquals("QUJD", subject.method1(new byte[]{'A', 'B', 'C'}));
        assertEquals("QUJD", subject.method2(new byte[]{'A', 'B', 'C'}));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null));
    }
}
