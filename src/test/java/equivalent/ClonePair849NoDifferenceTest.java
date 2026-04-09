package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair849NoDifferenceTest {

    private final ClonePair849 subject = new ClonePair849();

    @Test
    void noDifferenceFoundForRepresentativeReturnValuesAndSideEffects() {
        byte[] bytes1 = {'a', 'b', 0, 'c'};
        byte[] bytes2 = bytes1.clone();
        assertEquals("ab", subject.method1(bytes1, 0, 4).toString());
        assertEquals("ab", subject.method2(bytes2, 0, 4).toString());
        assertArrayEquals(bytes1, bytes2);

        byte[] sliced1 = {'x', 'a', 'b', 'c'};
        byte[] sliced2 = sliced1.clone();
        assertEquals("ab", subject.method1(sliced1, 1, 2).toString());
        assertEquals("ab", subject.method2(sliced2, 1, 2).toString());
        assertArrayEquals(sliced1, sliced2);
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 0, 1));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 0, 1));

        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{'a'}, 0, 2));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{'a'}, 0, 2));
    }
}
