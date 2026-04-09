package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1501NoDifferenceTest {

    private final ClonePair1501 subject = new ClonePair1501();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals("ab", subject.method1(new byte[]{'a', 'b', 0, 'c'}));
        assertEquals("ab", subject.method2(new byte[]{'a', 'b', 0, 'c'}));

        assertEquals("", subject.method1(new byte[]{0, 'a'}));
        assertEquals("", subject.method2(new byte[]{0, 'a'}));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null));
    }
}
