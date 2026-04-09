package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair1931NoDifferenceTest {

    private final ClonePair1931 subject = new ClonePair1931();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertNull(subject.method1(null));
        assertNull(subject.method2(null));

        byte[] bytes = {0x00, 0x0f, 0x10, 0x7f, (byte) 0x80, (byte) 0xff};
        assertEquals("000f107f80ff", subject.method1(bytes));
        assertEquals("000f107f80ff", subject.method2(bytes));
    }
}
