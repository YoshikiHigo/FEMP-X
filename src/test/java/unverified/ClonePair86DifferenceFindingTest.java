package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair86DifferenceFindingTest {

    private final ClonePair86 subject = new ClonePair86();

    @Test
    void methodsDisagreeOnCaseInsensitiveSearch() {
        char[] source = {'a'};
        char[] target = {'A'};

        assertEquals(0, subject.method1(source, 0, 1, target, 0, 1, 0));
        assertEquals(-1, subject.method2(source, 0, 1, target, 0, 1, 0));
    }
}
