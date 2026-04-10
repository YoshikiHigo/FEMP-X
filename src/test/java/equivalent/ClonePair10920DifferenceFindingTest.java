package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair10920DifferenceFindingTest {

    private final ClonePair10920 subject = new ClonePair10920();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertEquals("", subject.method1("", "", "x"));
        assertThrows(AssertionFailedError.class, () ->
            assertTimeoutPreemptively(Duration.ofMillis(200), () -> subject.method2("", "", "x")));
    }
}
