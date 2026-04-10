package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair3933DifferenceFindingTest {

    private final ClonePair3933 subject = new ClonePair3933();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        double method1Result = subject.method1(Double.NaN, 0.0d);
        assertTrue(Double.isNaN(method1Result));
        assertEquals(1.0d, subject.method2(Double.NaN, 0.0d));
    }
}
