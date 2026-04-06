package inequivalent;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair2799DifferenceFindingTest {

    private final ClonePair2799 subject = new ClonePair2799();

    @Test
    void methodsRecognizeDifferentBinaryHeaders() {
        byte[] pdfHeader = "%PDF-00000000000".getBytes(StandardCharsets.US_ASCII);

        assertTrue(subject.method1(pdfHeader));
        assertFalse(subject.method2(pdfHeader));
    }
}
