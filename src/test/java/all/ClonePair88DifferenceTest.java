package all;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair88DifferenceTest {

    private final ClonePair88 subject = new ClonePair88();

    @Test
    void methodsDivergeOnCaseOnlyDifference() {
        char[] source = "ab".toCharArray();
        char[] target = "B".toCharArray();

        assertEquals(1, subject.method1(source, 0, source.length, target, 0, target.length, 1));
        assertEquals(-1, subject.method2(source, 0, source.length, target, 0, target.length, 1));
    }
}
