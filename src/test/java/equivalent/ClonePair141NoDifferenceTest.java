package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair141NoDifferenceTest {

    private final ClonePair141 subject = new ClonePair141();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        String[] values = {"a", "b", "c"};

        assertEquals("a,b", subject.method1(values, ",", 0, 2));
        assertEquals("a,b", subject.method2(values, ",", 0, 2));

        assertEquals("a,b,c", subject.method1(values, ",", -5, 10));
        assertEquals("a,b,c", subject.method2(values, ",", -5, 10));

        assertEquals("", subject.method1(values, ",", 2, 2));
        assertEquals("", subject.method2(values, ",", 2, 2));

        assertEquals("", subject.method1(new String[0], ",", 0, 1));
        assertEquals("", subject.method2(new String[0], ",", 0, 1));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        String[] values = {"a", "b", "c"};
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(values, ",", -2, -1));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(values, ",", -2, -1));

        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, ",", 0, 1));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, ",", 0, 1));
    }
}
