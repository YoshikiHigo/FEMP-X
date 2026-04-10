package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair103NoDifferenceTest {

    private final ClonePair103 subject = new ClonePair103();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(5.0, subject.method1(5.0, 0.0, 10.0), 0.0);
        assertEquals(5.0, subject.method2(5.0, 0.0, 10.0), 0.0);

        assertEquals(0.5, subject.method1(0.5, 1.0, 0.0), 0.0);
        assertEquals(0.5, subject.method2(0.5, 1.0, 0.0), 0.0);

        assertTrue(Double.isNaN(subject.method1(Double.NaN, 0.0, 1.0)));
        assertTrue(Double.isNaN(subject.method2(Double.NaN, 0.0, 1.0)));
    }
}
