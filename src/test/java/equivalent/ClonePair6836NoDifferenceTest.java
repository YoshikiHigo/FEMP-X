package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6836NoDifferenceTest {

    private final ClonePair6836 subject = new ClonePair6836();

    @Test
    void earlyReturnPathStillMatches() {
        assertEquals(0, subject.method1(new byte[]{}, 2, 0, null, 0, 0, 0));
        assertEquals(0, subject.method2(new byte[]{}, 2, 0, null, 0, 0, 0));
    }
}
