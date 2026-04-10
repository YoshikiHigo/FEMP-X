package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair10842DifferenceFindingTest {

    private final ClonePair10842 subject = new ClonePair10842();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertFalse(subject.method1(8, -2, 3, 63, 0, 31, 64, Integer.MIN_VALUE));
        assertTrue(subject.method2(8, -2, 3, 63, 0, 31, 64, Integer.MIN_VALUE));
    }
}
