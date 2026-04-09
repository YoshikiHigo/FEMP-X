package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair189NoDifferenceTest {

    private final ClonePair189 subject = new ClonePair189();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertTrue(subject.method1(null, null));
        assertTrue(subject.method2(null, null));

        assertFalse(subject.method1(null, new byte[]{1}));
        assertFalse(subject.method2(null, new byte[]{1}));

        assertTrue(subject.method1(new byte[]{1, 2}, new byte[]{1, 2}));
        assertTrue(subject.method2(new byte[]{1, 2}, new byte[]{1, 2}));

        assertFalse(subject.method1(new byte[]{1}, new byte[]{2}));
        assertFalse(subject.method2(new byte[]{1}, new byte[]{2}));
    }
}
