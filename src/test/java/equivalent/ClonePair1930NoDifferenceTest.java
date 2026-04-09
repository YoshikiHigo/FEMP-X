package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair1930NoDifferenceTest {

    private final ClonePair1930 subject = new ClonePair1930();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertNull(subject.method1(null));
        assertNull(subject.method2(null));

        assertEquals(Byte.valueOf((byte) 42), subject.method1(42.9));
        assertEquals(Byte.valueOf((byte) 42), subject.method2(42.9));

        assertEquals(Byte.valueOf((byte) 0), subject.method1(Boolean.FALSE));
        assertEquals(Byte.valueOf((byte) 0), subject.method2(Boolean.FALSE));

        assertEquals(Byte.valueOf((byte) -1), subject.method1(Boolean.TRUE));
        assertEquals(Byte.valueOf((byte) -1), subject.method2(Boolean.TRUE));

        assertEquals(Byte.valueOf((byte) 7), subject.method1("7"));
        assertEquals(Byte.valueOf((byte) 7), subject.method2("7"));

        assertNull(subject.method1("x"));
        assertNull(subject.method2("x"));
    }
}
