package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair136NoDifferenceTest {

    private final ClonePair136 subject = new ClonePair136();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(0.5, subject.method1(0.5, 0.0, 1.0), 0.0);
        assertEquals(0.5, subject.method2(0.5, 0.0, 1.0), 0.0);

        assertEquals(1.0, subject.method1(0.5, 1.0, 1.0), 0.0);
        assertEquals(1.0, subject.method2(0.5, 1.0, 1.0), 0.0);
    }
}
