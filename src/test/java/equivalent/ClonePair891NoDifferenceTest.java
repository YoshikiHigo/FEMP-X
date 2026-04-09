package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class ClonePair891NoDifferenceTest {

    private final ClonePair891 subject = new ClonePair891();

    @Test
    void noDifferenceFoundForRepresentativeReturnValuesAndSideEffects() {
        double[] removeMiddle1 = {1.0, 2.0, 3.0};
        double[] removeMiddle2 = {1.0, 2.0, 3.0};
        assertArrayEquals(new double[]{1.0, 3.0}, subject.method1(removeMiddle1, 1));
        assertArrayEquals(new double[]{1.0, 3.0}, subject.method2(removeMiddle2, 1));
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, removeMiddle1);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, removeMiddle2);

        double[] removeFirst1 = {1.0, 2.0, 3.0};
        double[] removeFirst2 = {1.0, 2.0, 3.0};
        assertArrayEquals(new double[]{2.0, 3.0}, subject.method1(removeFirst1, 0));
        assertArrayEquals(new double[]{2.0, 3.0}, subject.method2(removeFirst2, 0));

        double[] invalid1 = {1.0, 2.0};
        double[] invalid2 = {1.0, 2.0};
        assertSame(invalid1, subject.method1(invalid1, -1));
        assertSame(invalid2, subject.method2(invalid2, -1));
        assertSame(invalid1, subject.method1(invalid1, 2));
        assertSame(invalid2, subject.method2(invalid2, 2));

        assertNull(subject.method1(null, 0));
        assertNull(subject.method2(null, 0));
    }
}
