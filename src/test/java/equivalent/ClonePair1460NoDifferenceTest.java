package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1460NoDifferenceTest {

    private final ClonePair1460 subject = new ClonePair1460();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(42, subject.method1(Integer.valueOf(42)));
        assertEquals(42, subject.method2(Integer.valueOf(42)));

        assertEquals(42, subject.method1("42"));
        assertEquals(42, subject.method2("42"));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1("x"));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2("x"));

        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null));
    }
}
