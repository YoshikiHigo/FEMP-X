package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair1923NoDifferenceTest {

    private final ClonePair1923 subject = new ClonePair1923();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertNull(subject.method1(null));
        assertNull(subject.method2(null));

        assertEquals("QQ==", subject.method1(new byte[]{'A'}));
        assertEquals("QQ==", subject.method2(new byte[]{'A'}));

        assertEquals("QUI=", subject.method1(new byte[]{'A', 'B'}));
        assertEquals("QUI=", subject.method2(new byte[]{'A', 'B'}));

        assertEquals("QUJD", subject.method1(new byte[]{'A', 'B', 'C'}));
        assertEquals("QUJD", subject.method2(new byte[]{'A', 'B', 'C'}));
    }
}
