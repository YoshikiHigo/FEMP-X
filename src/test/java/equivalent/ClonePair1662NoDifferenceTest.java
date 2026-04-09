package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair1662NoDifferenceTest {

    private final ClonePair1662 subject = new ClonePair1662();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertNull(subject.method1(null));
        assertNull(subject.method2(null));

        assertEquals(Integer.valueOf(42), subject.method1(Integer.valueOf(42)));
        assertEquals(Integer.valueOf(42), subject.method2(Integer.valueOf(42)));

        assertEquals(Integer.valueOf(42), subject.method1(42.9));
        assertEquals(Integer.valueOf(42), subject.method2(42.9));

        assertEquals(Integer.valueOf(7), subject.method1("7"));
        assertEquals(Integer.valueOf(7), subject.method2("7"));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1("x"));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2("x"));
    }
}
