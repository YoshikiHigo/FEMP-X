package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair8916DifferenceFindingTest {

    private final ClonePair8916 subject = new ClonePair8916();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> subject.method1(new byte[]{-128, 127, 64, 63}, -1, Integer.MIN_VALUE));
        assertEquals(0L, subject.method2(new byte[]{-128, 127, 64, 63}, -1, Integer.MIN_VALUE));
    }
}
