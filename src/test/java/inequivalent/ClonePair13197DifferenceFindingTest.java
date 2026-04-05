package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair13197DifferenceFindingTest {

    private final ClonePair13197 subject = new ClonePair13197();

    @Test
    void methodsSplitInputDifferentlyWithoutSeparator() {
        assertArrayEquals(new String[]{"010", null}, subject.method1("010"));
        assertArrayEquals(new String[]{"", "010"}, subject.method2("010"));
    }
}
