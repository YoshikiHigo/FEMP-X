package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair5784NoDifferenceTest {

    private final ClonePair5784 subject = new ClonePair5784();

    @Test
    void representativePlaceholderInputStillMatches() {
        assertEquals("x", subject.method1("{}", "x", null));
        assertEquals("x", subject.method2("{}", "x", null));
    }
}
