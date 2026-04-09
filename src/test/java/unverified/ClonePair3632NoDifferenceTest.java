package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3632NoDifferenceTest {

    private final ClonePair3632 subject = new ClonePair3632();

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
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{0}, new int[]{}}),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{0}, new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{0}, new int[]{1}}),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), new Object[]{new int[]{0}, new int[]{1}})
        );
    }
}
