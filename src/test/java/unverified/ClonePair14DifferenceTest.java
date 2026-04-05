package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair14DifferenceTest {

    private final ClonePair14 subject = new ClonePair14();

    @Test
    void methodsDivergeOnOctalLikeInput() {
        assertEquals(Long.valueOf(8L), subject.method1("010"));
        assertEquals(Long.valueOf(10L), subject.method2("010"));
    }
}
