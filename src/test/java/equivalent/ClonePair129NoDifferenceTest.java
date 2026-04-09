package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair129NoDifferenceTest {

    private final ClonePair129 subject = new ClonePair129();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(0.0, subject.method1(-1.0, 0.0, 10.0));
        assertEquals(0.0, subject.method2(-1.0, 0.0, 10.0));

        assertEquals(5.0, subject.method1(5.0, 0.0, 10.0));
        assertEquals(5.0, subject.method2(5.0, 0.0, 10.0));

        assertEquals(10.0, subject.method1(11.0, 0.0, 10.0));
        assertEquals(10.0, subject.method2(11.0, 0.0, 10.0));

        assertTrue(Double.isNaN(subject.method1(Double.NaN, 0.0, 10.0)));
        assertTrue(Double.isNaN(subject.method2(Double.NaN, 0.0, 10.0)));
    }
}
