package all;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair93DifferenceTest {

    private final ClonePair93 subject = new ClonePair93();

    @Test
    void methodsDivergeOnFormFeed() {
        char[] chars = {'\f'};

        assertTrue(subject.method1(chars, 0, 1));
        assertFalse(subject.method2(chars, 0, 1));
    }
}
