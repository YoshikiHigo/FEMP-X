package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair3555DifferenceFindingTest {

    private final ClonePair3555 subject = new ClonePair3555();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertTrue(subject.method1(new double[][]{new double[]{-180.0d, 180.0d, Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.MAX_VALUE, Double.MIN_NORMAL, Double.MIN_VALUE}}, new double[][]{new double[]{-180.0d, 180.0d, Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.MAX_VALUE, Double.MIN_NORMAL, Double.MIN_VALUE}}));
        assertFalse(subject.method2(new double[][]{new double[]{-180.0d, 180.0d, Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.MAX_VALUE, Double.MIN_NORMAL, Double.MIN_VALUE}}, new double[][]{new double[]{-180.0d, 180.0d, Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.MAX_VALUE, Double.MIN_NORMAL, Double.MIN_VALUE}}));
    }
}
