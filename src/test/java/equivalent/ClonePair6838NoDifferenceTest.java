package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6838NoDifferenceTest {

    private final ClonePair6838 subject = new ClonePair6838();

    @Test
    void nonPositiveInputStillMatches() {
        assertEquals(-1, subject.method1(0, 4));
        assertEquals(-1, subject.method2(0, 4));
    }
}
