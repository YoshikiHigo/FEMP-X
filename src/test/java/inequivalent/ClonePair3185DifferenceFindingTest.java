package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3185DifferenceFindingTest {

    private final ClonePair3185 subject = new ClonePair3185();

    @Test
    void methodsMutateSingleZeroMatrixDifferently() {
        double[][] method1Input = {{0.0}};
        double[][] method2Input = {{0.0}};

        assertEquals(0.0, subject.method1(method1Input)[0][0]);
        assertEquals(Double.POSITIVE_INFINITY, subject.method2(method2Input)[0][0]);
        assertEquals(0.0, method1Input[0][0]);
        assertEquals(Double.POSITIVE_INFINITY, method2Input[0][0]);
    }
}
