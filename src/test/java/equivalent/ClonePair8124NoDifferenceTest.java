package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair8124NoDifferenceTest {

    private final ClonePair8124 subject = new ClonePair8124();

    @Test
    void zeroLengthNullCharacterArrayStillMatches() {
        assertArrayEquals(new byte[]{}, subject.method1(null, 0, 0));
        assertArrayEquals(new byte[]{}, subject.method2(null, 0, 0));
    }
}
