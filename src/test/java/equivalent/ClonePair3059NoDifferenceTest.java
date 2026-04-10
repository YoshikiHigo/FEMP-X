package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair3059NoDifferenceTest {

    private final ClonePair3059 subject = new ClonePair3059();

    @Test
    void candidateInputStillProducesTheSameTokens() {
        assertArrayEquals(new String[]{"a"}, subject.method1("a", "-"));
        assertArrayEquals(new String[]{"a"}, subject.method2("a", "-"));
    }
}
