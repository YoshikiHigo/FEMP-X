package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12778NoDifferenceTest {

    private final ClonePair12778 subject = new ClonePair12778();

    @Test
    void outOfRangeBaseCandidateStillMatches() {
        assertEquals(0L, subject.method1("0", 255));
        assertEquals(0L, subject.method2("0", 255));
    }
}
