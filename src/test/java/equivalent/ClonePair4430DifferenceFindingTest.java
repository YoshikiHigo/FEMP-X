package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair4430DifferenceFindingTest {

    private final ClonePair4430 subject = new ClonePair4430();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertTrue(subject.method1(2.0f, 2.0f, Float.MIN_VALUE));
        assertFalse(subject.method2(2.0f, 2.0f, Float.MIN_VALUE));
    }
}
