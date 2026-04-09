package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair94DifferenceFindingTest {

    private final ClonePair94 subject = new ClonePair94();

    @Test
    void methodsInterpretNonDigitPlaceholderDifferently() {
        Object[] args = {};

        assertEquals("{:}", subject.method1("{:}", args));
        assertEquals("<missing argument>", subject.method2("{:}", args));
    }
}
