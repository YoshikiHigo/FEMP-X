package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair5863DifferenceFindingTest {

    private final ClonePair5863 subject = new ClonePair5863();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertTrue(subject.method1(new byte[]{0, 0, 0}, 128, new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 128, Integer.MIN_VALUE));
        assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> subject.method2(new byte[]{0, 0, 0}, 128, new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 128, Integer.MIN_VALUE));
    }
}
