package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair6513DifferenceFindingTest {

    private final ClonePair6513 subject = new ClonePair6513();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertThrows(java.lang.NullPointerException.class, () -> subject.method1(null, Integer.MIN_VALUE));
        assertEquals(0L, subject.method2(null, Integer.MIN_VALUE));
    }
}
