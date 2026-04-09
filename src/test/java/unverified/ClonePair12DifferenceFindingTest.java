package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12DifferenceFindingTest {

    private final ClonePair12 subject = new ClonePair12();

    @Test
    void methodsInterpretLeadingZeroStringsDifferently() {
        String input = "010";

        assertEquals(Long.valueOf(8L), subject.method1(input));
        assertEquals(Long.valueOf(10L), subject.method2(input));
    }
}
