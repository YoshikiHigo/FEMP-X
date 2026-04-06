package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3181DifferenceFindingTest {

    private final ClonePair3181 subject = new ClonePair3181();

    @Test
    void methodsHandleSingleColumnMatrixDifferently() {
        assertEquals(0.0, subject.method1(new double[][]{{0.0}})[0][0]);
        assertTrue(Double.isNaN(subject.method2(new double[][]{{0.0}})[0][0]));
    }
}
