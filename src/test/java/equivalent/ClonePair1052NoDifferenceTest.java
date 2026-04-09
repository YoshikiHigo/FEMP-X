package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1052NoDifferenceTest {

    private final ClonePair1052 subject = new ClonePair1052();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        Integer[] values = {1, 3, 5, 7};
        assertEquals(2, subject.method1(values, 5));
        assertEquals(2, subject.method2(values, 5));

        assertEquals(-3, subject.method1(values, 4));
        assertEquals(-3, subject.method2(values, 4));

        assertEquals(-1, subject.method1(new Integer[]{}, 1));
        assertEquals(-1, subject.method2(new Integer[]{}, 1));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, 1));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, 1));
    }
}
