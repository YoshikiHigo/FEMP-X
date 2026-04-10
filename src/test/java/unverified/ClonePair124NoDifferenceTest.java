package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair124NoDifferenceTest {

    private final ClonePair124 subject = new ClonePair124();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(1.6, subject.method1(1.0, 2.0, 0.1), 1.0e-12);
        assertEquals(1.6, subject.method2(1.0, 2.0, 0.1), 1.0e-12);

        assertEquals(1.0, subject.method1(1.0, 2.0, -0.1), 1.0e-12);
        assertEquals(1.0, subject.method2(1.0, 2.0, -0.1), 1.0e-12);
    }
}
