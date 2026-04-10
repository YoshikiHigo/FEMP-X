package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair6791DifferenceFindingTest {

    private final ClonePair6791 subject = new ClonePair6791();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertEquals(-1, subject.method1(0, 0, -1));
        assertEquals(0, subject.method2(0, 0, -1));
    }
}
