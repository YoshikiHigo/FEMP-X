package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair3058DifferenceFindingTest {

    private final ClonePair3058 subject = new ClonePair3058();

    @Test
    void methodsSplitAtLastAndFirstSeparatorDifferently() {
        assertArrayEquals(new String[]{"a,b", "c"}, subject.method1("a,b,c", ","));
        assertArrayEquals(new String[]{"a", "b,c"}, subject.method2("a,b,c", ","));
    }
}
