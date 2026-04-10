package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8721NoDifferenceTest {

    private final ClonePair8721 subject = new ClonePair8721();

    @Test
    void excerptCandidateStillMatches() {
        assertEquals("0", subject.method1("0", new String[]{"", "", ""}, 256));
        assertEquals("0", subject.method2("0", new String[]{"", "", ""}, 256));
    }
}
