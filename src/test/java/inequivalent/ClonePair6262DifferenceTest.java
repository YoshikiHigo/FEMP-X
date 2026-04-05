package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClonePair6262DifferenceTest {

    private final ClonePair6262 subject = new ClonePair6262();

    @Test
    void methodsDivergeOnGeneratedCounterexample() {
        assertNotEquals(subject.method1(1, 1, 1), subject.method2(1, 1, 1));
    }
}
