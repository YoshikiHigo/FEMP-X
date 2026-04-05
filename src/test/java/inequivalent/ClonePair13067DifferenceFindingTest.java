package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair13067DifferenceFindingTest {

    private final ClonePair13067 subject = new ClonePair13067();

    @Test
    void methodsTreatTabWhitespaceDifferently() {
        assertArrayEquals(new String[]{"a\tb"}, subject.method1("a\tb"));
        assertArrayEquals(new String[]{"a", "b"}, subject.method2("a\tb"));
    }
}
