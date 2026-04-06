package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3178DifferenceFindingTest {

    private final ClonePair3178 subject = new ClonePair3178();

    @Test
    void methodsRankStringsDifferently() {
        assertEquals(1, subject.method1("42.0", "010"));
        assertEquals(-1, subject.method2("42.0", "010"));
    }
}
