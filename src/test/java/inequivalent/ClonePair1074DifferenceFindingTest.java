package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1074DifferenceFindingTest {

    private final ClonePair1074 subject = new ClonePair1074();

    @Test
    void methodsTreatEqualButDistinctObjectsDifferently() {
        Object[] values = {new String("a")};
        Object target = new String("a");

        assertEquals(-1, subject.method1(values, target));
        assertEquals(0, subject.method2(values, target));
    }
}
