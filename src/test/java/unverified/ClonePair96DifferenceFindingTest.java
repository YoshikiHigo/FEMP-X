package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair96DifferenceFindingTest {

    private final ClonePair96 subject = new ClonePair96();

    @Test
    void methodsInterpretFullWidthPlaceholderDigitsDifferently() {
        Object[] args = {"zero", "one"};
        String format = "{１}";

        assertEquals("{１}", subject.method1(format, args));
        assertEquals("one", subject.method2(format, args));
    }
}
