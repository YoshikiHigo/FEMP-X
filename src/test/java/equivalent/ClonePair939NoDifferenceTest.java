package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair939NoDifferenceTest {

    private final ClonePair939 subject = new ClonePair939();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] bytes = {'x', 'a', 'b', 0, 'c'};
        assertEquals("ab", subject.method1(bytes, 1));
        assertEquals("ab", subject.method2(bytes, 1));

        assertEquals("", subject.method1(bytes, 3));
        assertEquals("", subject.method2(bytes, 3));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{'a'}, 0));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{'a'}, 0));

        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 0));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 0));
    }
}
