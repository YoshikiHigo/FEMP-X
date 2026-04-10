package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair8919DifferenceFindingTest {

    private final ClonePair8919 subject = new ClonePair8919();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        int[] method1Values = new int[]{0, 1};
        assertEquals(0, subject.method1(method1Values, 1, 0));
        assertArrayEquals(new int[]{0, 1}, method1Values);
        int[] method2Values = new int[]{0, 1};
        assertEquals(0, subject.method2(method2Values, 1, 0));
        assertArrayEquals(new int[]{1, 0}, method2Values);
    }
}
