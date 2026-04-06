package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair140DifferenceFindingTest {

    private final ClonePair140 subject = new ClonePair140();

    @Test
    void methodsInterpretThirdComponentDifferently() {
        assertEquals(0xFF0000, subject.method1(0.0f, 1.0f, 1.0f));
        assertEquals(0xFFFFFF, subject.method2(0.0f, 1.0f, 1.0f));
    }
}
