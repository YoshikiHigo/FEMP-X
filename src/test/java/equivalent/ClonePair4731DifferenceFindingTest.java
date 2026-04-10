package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair4731DifferenceFindingTest {

    private final ClonePair4731 subject = new ClonePair4731();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        String[] method1Result = subject.method1(new String[]{"", "a", "A", "0"}, 127, 8);
        String[] method2Result = subject.method2(new String[]{"", "a", "A", "0"}, 127, 8);
        assertEquals(8, method1Result.length);
        assertEquals(8, method2Result.length);
        assertFalse(Arrays.equals(method1Result, method2Result));
    }
}
