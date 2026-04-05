package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair78DifferenceTest {

    private final ClonePair78 subject = new ClonePair78();

    @Test
    void methodsDivergeOnCaseOnlyDifference() {
        char[] source = "ab".toCharArray();
        char[] target = "B".toCharArray();

        assertEquals(-1, subject.method1(source, 0, source.length, target, 0, target.length, 0));
        assertEquals(1, subject.method2(source, 0, source.length, target, 0, target.length, 0));
    }
}
