package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair89DifferenceTest {

    private final ClonePair89 subject = new ClonePair89();

    @Test
    void methodsDivergeOnCarriageReturn() {
        char[] chars = {'\r'};

        assertFalse(subject.method1(chars, 0, 1));
        assertTrue(subject.method2(chars, 0, 1));
    }
}
