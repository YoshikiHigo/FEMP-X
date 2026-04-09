package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3355NoDifferenceTest {

    private final ClonePair3355 subject = new ClonePair3355();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{}, new int[]{}}),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{}, new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), new Object[]{null, new int[]{}}),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), new Object[]{null, new int[]{}})
        );
    }
}
