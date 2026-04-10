package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair879DifferenceFindingTest {

    private final ClonePair879 subject = new ClonePair879();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertTrue(subject.method1(null, new byte[]{}));
        assertThrows(java.lang.NullPointerException.class, () -> subject.method2(null, new byte[]{}));
    }
}
