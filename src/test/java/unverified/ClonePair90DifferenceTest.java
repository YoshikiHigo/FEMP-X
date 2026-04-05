package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair90DifferenceTest {

    private final ClonePair90 subject = new ClonePair90();

    @Test
    void methodsDivergeOnCarriageReturn() {
        char[] chars = {'\r'};

        assertFalse(subject.method1(chars, 0, 1));
        assertTrue(subject.method2(chars, 0, 1));
    }
}
