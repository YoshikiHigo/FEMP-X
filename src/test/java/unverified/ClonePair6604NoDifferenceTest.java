package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6604NoDifferenceTest {

    private final ClonePair6604 subject = new ClonePair6604();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], (long[]) values[1]), new Object[]{new long[]{}, new long[]{}}),
            capture(values -> subject.method2((long[]) values[0], (long[]) values[1]), new Object[]{new long[]{}, new long[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], (long[]) values[1]), new Object[]{null, new long[]{}}),
            capture(values -> subject.method2((long[]) values[0], (long[]) values[1]), new Object[]{null, new long[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0], (long[]) values[1]), new Object[]{new long[]{0L}, new long[]{}}),
            capture(values -> subject.method2((long[]) values[0], (long[]) values[1]), new Object[]{new long[]{0L}, new long[]{}})
        );
    }
}
