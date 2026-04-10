package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair9672NoDifferenceTest {

    private final ClonePair9672 subject = new ClonePair9672();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0]), new Object[]{new int[]{}}),
            capture(values -> subject.method2((int[]) values[0]), new Object[]{new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0]), new Object[]{null}),
            capture(values -> subject.method2((int[]) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0]), new Object[]{new int[]{1}}),
            capture(values -> subject.method2((int[]) values[0]), new Object[]{new int[]{1}})
        );
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0]), new Object[]{new int[]{1, 2}}),
            capture(values -> subject.method2((int[]) values[0]), new Object[]{new int[]{1, 2}})
        );
    }
}
