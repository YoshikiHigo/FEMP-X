package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair75NoDifferenceTest {

    private final ClonePair75 subject = new ClonePair75();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        char[] values = {'a', 'b', 'c', 'b'};
        assertEquals(1, subject.method1(values, 'b', 0));
        assertEquals(1, subject.method2(values, 'b', 0));

        assertEquals(3, subject.method1(values, 'b', 2));
        assertEquals(3, subject.method2(values, 'b', 2));

        assertEquals(-1, subject.method1(values, 'z', 0));
        assertEquals(-1, subject.method2(values, 'z', 0));

        assertEquals(-1, subject.method1(values, 'a', values.length));
        assertEquals(-1, subject.method2(values, 'a', values.length));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 'a', 0));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 'a', 0));

        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new char[]{'a'}, 'a', -1));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new char[]{'a'}, 'a', -1));
    }
}
