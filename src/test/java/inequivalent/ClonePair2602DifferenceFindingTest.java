package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair2602DifferenceFindingTest {

    private final ClonePair2602 subject = new ClonePair2602();

    @Test
    void methodsUseDifferentDefaultSecondElementWhenSeparatorIsAbsent() {
        assertArrayEquals(new String[]{"abc", null}, subject.method1("abc", "x"));
        assertArrayEquals(new String[]{"abc", ""}, subject.method2("abc", "x"));
    }
}
