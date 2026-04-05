package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair13368DifferenceFindingTest {

    private final ClonePair13368 subject = new ClonePair13368();

    @Test
    void methodsSplitTabOnlyInputDifferently() {
        assertArrayEquals(new String[]{"\t"}, subject.method1("\t"));
        assertArrayEquals(new String[]{""}, subject.method2("\t"));
    }
}
