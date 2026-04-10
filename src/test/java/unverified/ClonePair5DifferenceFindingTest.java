package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair5DifferenceFindingTest {

    private final ClonePair5 subject = new ClonePair5();

    @Test
    void methodsDisagreeOnSecSuffixInputs() {
        String input = "1(sec)";

        assertEquals(Long.valueOf(1L), subject.method1(input));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2(input));
    }

    @Test
    void methodsDisagreeOnWhitespaceOnlyInputs() {
        String input = " ";

        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1(input));
        assertNull(subject.method2(input));
    }
}
