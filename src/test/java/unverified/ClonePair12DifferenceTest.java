package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12DifferenceTest {

    private final ClonePair12 subject = new ClonePair12();

    @Test
    void methodsDivergeOnOctalLikeInput() {
        assertEquals(Long.valueOf(8L), subject.method1("010"));
        assertEquals(Long.valueOf(10L), subject.method2("010"));
    }
}
