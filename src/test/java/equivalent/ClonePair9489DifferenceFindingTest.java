package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair9489DifferenceFindingTest {

    private final ClonePair9489 subject = new ClonePair9489();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertThrows(java.lang.StringIndexOutOfBoundsException.class, () -> subject.method1(" ", 0));
        assertEquals(1, subject.method2(" ", 0));
    }
}
