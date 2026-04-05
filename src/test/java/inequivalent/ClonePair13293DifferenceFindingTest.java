package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair13293DifferenceFindingTest {

    private final ClonePair13293 subject = new ClonePair13293();

    @Test
    void methodsTreatNewlineWithinChunkDifferently() {
        assertArrayEquals(new String[]{"a\n", "b"}, subject.method1("a\nb", 2));
        assertArrayEquals(new String[]{"a", "b"}, subject.method2("a\nb", 2));
    }
}
