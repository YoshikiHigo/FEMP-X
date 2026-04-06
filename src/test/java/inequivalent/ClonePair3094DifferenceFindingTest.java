package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3094DifferenceFindingTest {

    private final ClonePair3094 subject = new ClonePair3094();

    @Test
    void methodsRecognizeDifferentHeaders() {
        byte[] pngHeader = {(byte) 137, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 0, 0, 0, 0, 0};

        assertFalse(subject.method1(pngHeader));
        assertTrue(subject.method2(pngHeader));
    }
}
