package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair1632NoDifferenceTest {

    private final ClonePair1632 subject = new ClonePair1632();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertNull(subject.method1(null));
        assertNull(subject.method2(null));

        assertEquals(Integer.valueOf(42), subject.method1(42.9));
        assertEquals(Integer.valueOf(42), subject.method2(42.9));

        assertEquals(Integer.valueOf(0), subject.method1(Boolean.FALSE));
        assertEquals(Integer.valueOf(0), subject.method2(Boolean.FALSE));

        assertEquals(Integer.valueOf(-1), subject.method1(Boolean.TRUE));
        assertEquals(Integer.valueOf(-1), subject.method2(Boolean.TRUE));

        assertEquals(Integer.valueOf(7), subject.method1("7"));
        assertEquals(Integer.valueOf(7), subject.method2("7"));

        assertNull(subject.method1("x"));
        assertNull(subject.method2("x"));
    }
}
