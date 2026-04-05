package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7DifferenceTest {

    private final ClonePair7 subject = new ClonePair7();

    @Test
    void methodsDivergeOnOctalLikeInput() {
        assertEquals(Long.valueOf(8L), subject.method1("010"));
        assertEquals(Long.valueOf(10L), subject.method2("010"));
    }
}
