package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair3943DifferenceFindingTest {

    private final ClonePair3943 subject = new ClonePair3943();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        double method1Result = subject.method1(-0.0d, 1.0d);
        assertEquals(Double.doubleToRawLongBits(-0.0d), Double.doubleToRawLongBits(method1Result));
        double method2Result = subject.method2(-0.0d, 1.0d);
        assertEquals(Double.doubleToRawLongBits(0.0d), Double.doubleToRawLongBits(method2Result));
    }
}
