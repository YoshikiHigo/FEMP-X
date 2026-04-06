package inequivalent;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3105DifferenceFindingTest {

    private final ClonePair3105 subject = new ClonePair3105();

    @Test
    void methodsRecognizeDifferentNetworkHeaders() {
        byte[] artNet = "Art-Net\0\0\0".getBytes(StandardCharsets.ISO_8859_1);

        assertFalse(subject.method1(artNet));
        assertTrue(subject.method2(artNet));
    }
}
