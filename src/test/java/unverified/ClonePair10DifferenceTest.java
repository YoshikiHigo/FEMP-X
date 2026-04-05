package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10DifferenceTest {

    private final ClonePair10 subject = new ClonePair10();

    @Test
    void methodsDivergeOnOctalLikeInput() {
        assertEquals(Long.valueOf(8L), subject.method1("010"));
        assertEquals(Long.valueOf(10L), subject.method2("010"));
    }
}
