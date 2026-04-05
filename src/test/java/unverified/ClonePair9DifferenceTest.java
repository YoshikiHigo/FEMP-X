package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9DifferenceTest {

    private final ClonePair9 subject = new ClonePair9();

    @Test
    void methodsDivergeOnOctalLikeInput() {
        assertEquals(Long.valueOf(8L), subject.method1("010"));
        assertEquals(Long.valueOf(10L), subject.method2("010"));
    }
}
