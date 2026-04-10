package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair13DifferenceFindingTest {

    private final ClonePair13 subject = new ClonePair13();

    @Test
    void methodsInterpretLeadingZeroStringsDifferently() {
        String input = "010";

        assertEquals(Long.valueOf(8L), subject.method1(input));
        assertEquals(Long.valueOf(10L), subject.method2(input));
    }
}
