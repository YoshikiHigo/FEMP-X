package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair90DifferenceFindingTest {

    private final ClonePair90 subject = new ClonePair90();

    @Test
    void methodsTreatCarriageReturnDifferently() {
        char[] input = {'\r'};

        assertFalse(subject.method1(input, 0, 1));
        assertTrue(subject.method2(input, 0, 1));
    }
}
