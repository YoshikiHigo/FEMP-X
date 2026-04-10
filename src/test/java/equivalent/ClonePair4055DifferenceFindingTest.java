package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair4055DifferenceFindingTest {

    private final ClonePair4055 subject = new ClonePair4055();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        double method1Result = subject.method1(Double.NaN, 0.0d);
        assertTrue(Double.isNaN(method1Result));
        double method2Result = subject.method2(Double.NaN, 0.0d);
        assertEquals(Double.doubleToRawLongBits(0.0d), Double.doubleToRawLongBits(method2Result));
    }
}
