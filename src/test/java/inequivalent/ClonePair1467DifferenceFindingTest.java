package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1467DifferenceFindingTest {

    private final ClonePair1467 subject = new ClonePair1467();

    @Test
    void methodsHandleOutOfRangeLongDifferently() {
        assertEquals(0, subject.method1(Long.MAX_VALUE));
        assertEquals(-1, subject.method2(Long.MAX_VALUE));
    }
}
