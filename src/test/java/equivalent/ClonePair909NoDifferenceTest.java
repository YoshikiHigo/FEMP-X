package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair909NoDifferenceTest {

    private final ClonePair909 subject = new ClonePair909();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        char[] key = {'x', 'a', 'b', 'c'};
        char[] word = {'a', 'b'};
        assertTrue(subject.method1(key, 1, 2, word));
        assertTrue(subject.method2(key, 1, 2, word));

        assertFalse(subject.method1(key, 1, 3, word));
        assertFalse(subject.method2(key, 1, 3, word));

        assertFalse(subject.method1(key, 1, 2, new char[]{'a', 'c'}));
        assertFalse(subject.method2(key, 1, 2, new char[]{'a', 'c'}));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new char[]{'a'}, 1, 1, new char[]{'a'}));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new char[]{'a'}, 1, 1, new char[]{'a'}));

        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 0, 1, new char[]{'a'}));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 0, 1, new char[]{'a'}));
    }
}
