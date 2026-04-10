package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair32DifferenceFindingTest {

    private final ClonePair32 subject = new ClonePair32();

    @Test
    void methodsInterpretTrailingDotZeroStringsDifferently() {
        String input = "42.0";

        assertEquals(Long.valueOf(42L), subject.method1(input));
        assertNull(subject.method2(input));
    }
}
