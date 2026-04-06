package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3970DifferenceFindingTest {

    private final ClonePair3970 subject = new ClonePair3970();

    @Test
    void methodsAccumulateLargeCountsWithDifferentPrecision() {
        assertEquals(16777216, subject.method1(new int[3], new int[]{16777216, 1}, 2));
        assertEquals(16777217, subject.method2(new int[3], new int[]{16777216, 1}, 2));
    }
}
