package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair94DifferenceTest {

    private final ClonePair94 subject = new ClonePair94();

    @Test
    void methodsDivergeOnFullWidthDigitPlaceholder() {
        Object[] args = {"zero", "one"};
        String format = "{\uFF11}";

        assertEquals("one", subject.method1(format, args));
        assertEquals("{\uFF11}", subject.method2(format, args));
    }
}
