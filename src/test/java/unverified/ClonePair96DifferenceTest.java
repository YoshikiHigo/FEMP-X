package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair96DifferenceTest {

    private final ClonePair96 subject = new ClonePair96();

    @Test
    void methodsDivergeOnFullWidthDigitPlaceholder() {
        Object[] args = {"zero", "one"};
        String format = "{\uFF11}";

        assertEquals("{\uFF11}", subject.method1(format, args));
        assertEquals("one", subject.method2(format, args));
    }
}
