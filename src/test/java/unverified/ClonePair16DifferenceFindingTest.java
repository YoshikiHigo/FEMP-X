package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair16DifferenceFindingTest {

    private final ClonePair16 subject = new ClonePair16();

    @Test
    void methodsInterpretTrailingDotZeroStringsDifferently() {
        String input = "42.0";

        assertNull(subject.method1(input));
        assertEquals(Long.valueOf(42L), subject.method2(input));
    }
}
