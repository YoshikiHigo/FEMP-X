package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3397NoDifferenceTest {

    private final ClonePair3397 subject = new ClonePair3397();

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
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{1, 2}, new int[]{}}),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{1, 2}, new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{1, 2}, new int[]{0}}),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{1, 2}, new int[]{0}})
        );
    }
}
