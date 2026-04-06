package inequivalent;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3116DifferenceFindingTest {

    private final ClonePair3116 subject = new ClonePair3116();

    @Test
    void methodsRecognizeDifferentImageHeaders() {
        byte[] gifHeader = "GIF89a".getBytes(StandardCharsets.ISO_8859_1);

        assertTrue(subject.method1(gifHeader));
        assertFalse(subject.method2(gifHeader));
    }
}
