package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair12596DifferenceFindingTest {

    private final ClonePair12596 subject = new ClonePair12596();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertNull(subject.method1(null, Integer.MIN_VALUE));
        assertThrows(java.lang.NullPointerException.class, () -> subject.method2(null, Integer.MIN_VALUE));
    }
}
