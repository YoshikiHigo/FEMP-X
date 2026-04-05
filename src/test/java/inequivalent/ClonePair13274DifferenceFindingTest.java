package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair13274DifferenceFindingTest {

    private final ClonePair13274 subject = new ClonePair13274();

    @Test
    void methodsTreatOutOfRangeOctetDifferently() {
        assertNull(subject.method1("256.0.0.0"));
        assertArrayEquals(new byte[]{0, 0, 0, 0}, subject.method2("256.0.0.0"));
    }
}
