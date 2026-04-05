package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair86DifferenceTest {

    private final ClonePair86 subject = new ClonePair86();

    @Test
    void methodsDivergeOnCaseOnlyDifference() {
        char[] source = "ab".toCharArray();
        char[] target = "B".toCharArray();

        assertEquals(1, subject.method1(source, 0, source.length, target, 0, target.length, 0));
        assertEquals(-1, subject.method2(source, 0, source.length, target, 0, target.length, 0));
    }
}
