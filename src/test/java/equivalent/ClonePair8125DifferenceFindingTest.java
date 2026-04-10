package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair8125DifferenceFindingTest {

    private final ClonePair8125 subject = new ClonePair8125();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertThrows(java.lang.NullPointerException.class, () -> subject.method1(null, Integer.MIN_VALUE, 0));
        assertArrayEquals(new byte[]{}, subject.method2(null, Integer.MIN_VALUE, 0));
    }
}
