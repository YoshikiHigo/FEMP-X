package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair4819DifferenceFindingTest {

    private final ClonePair4819 subject = new ClonePair4819();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        double method1Result = subject.method1(new double[]{0.0d, -0.0d});
        assertEquals(Double.doubleToRawLongBits(-0.0d), Double.doubleToRawLongBits(method1Result));
        double method2Result = subject.method2(new double[]{0.0d, -0.0d});
        assertEquals(Double.doubleToRawLongBits(0.0d), Double.doubleToRawLongBits(method2Result));
    }
}
