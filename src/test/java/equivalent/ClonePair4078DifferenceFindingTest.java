package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair4078DifferenceFindingTest {

    private final ClonePair4078 subject = new ClonePair4078();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertTrue(subject.method1(new String[]{"", ""}, new String[]{"", "a"}));
        assertFalse(subject.method2(new String[]{"", ""}, new String[]{"", "a"}));
    }
}
