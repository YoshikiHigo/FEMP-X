package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair13060DifferenceFindingTest {

    private final ClonePair13060 subject = new ClonePair13060();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertThrows(java.lang.NullPointerException.class, () -> subject.method1("a", "A", null));
        assertEquals("a", subject.method2("a", "A", null));
    }
}
