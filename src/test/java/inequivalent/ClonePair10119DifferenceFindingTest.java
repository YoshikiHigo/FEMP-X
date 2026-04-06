package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10119DifferenceFindingTest {
    @Test
    void methodsRoundLongDecimalStringsDifferently() {
        ClonePair10119 clonePair = new ClonePair10119();
        double input = 0.123456789012345;

        assertEquals(0.1234567890123, clonePair.method1(input), 0.0);
        assertEquals(input, clonePair.method2(input), 0.0);
    }
}
