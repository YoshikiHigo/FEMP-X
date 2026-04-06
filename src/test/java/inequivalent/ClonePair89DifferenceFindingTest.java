package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair89DifferenceFindingTest {

    private final ClonePair89 subject = new ClonePair89();

    @Test
    void methodsTreatCarriageReturnDifferently() {
        char[] input = {'\r'};

        assertFalse(subject.method1(input, 0, 1));
        assertTrue(subject.method2(input, 0, 1));
    }
}
