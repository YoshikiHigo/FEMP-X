package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair130NoDifferenceTest {

    private final ClonePair130 subject = new ClonePair130();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(0.5, subject.method1(0.5, 0.0, 1.0), 0.0);
        assertEquals(0.5, subject.method2(0.5, 0.0, 1.0), 0.0);

        assertEquals(1.0, subject.method1(0.5, 1.0, 1.0), 0.0);
        assertEquals(1.0, subject.method2(0.5, 1.0, 1.0), 0.0);
    }
}
