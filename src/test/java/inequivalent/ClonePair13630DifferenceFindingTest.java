package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair13630DifferenceFindingTest {

    private final ClonePair13630 subject = new ClonePair13630();

    @Test
    void methodsReturnDifferentValuesWhenLaterCharactersRemainUppercase() {
        assertEquals("ab", subject.method1("AB"));
        assertEquals("aB", subject.method2("AB"));
    }
}
