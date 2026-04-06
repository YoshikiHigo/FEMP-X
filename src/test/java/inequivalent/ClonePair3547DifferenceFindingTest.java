package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair3547DifferenceFindingTest {

    private final ClonePair3547 subject = new ClonePair3547();

    @Test
    void methodsReturnColumnMaximaAndMinimaDifferently() {
        double[][] front = {{1.0, 2.0}, {3.0, 0.0}};

        assertArrayEquals(new double[]{3.0, 2.0}, subject.method1(front, 2));
        assertArrayEquals(new double[]{1.0, 0.0}, subject.method2(front, 2));
    }
}
