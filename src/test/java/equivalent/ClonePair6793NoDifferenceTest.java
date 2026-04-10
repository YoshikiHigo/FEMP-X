package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair6793NoDifferenceTest {

    private final ClonePair6793 subject = new ClonePair6793();

    @Test
    void candidateInputStillProducesTheSameSplit() {
        assertArrayEquals(new String[]{" "}, subject.method1(" ", "aa", 'a', '-'));
        assertArrayEquals(new String[]{" "}, subject.method2(" ", "aa", 'a', '-'));
    }
}
