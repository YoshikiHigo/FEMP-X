package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3863NoDifferenceTest {

    private final ClonePair3863 subject = new ClonePair3863();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{}, new double[]{}}),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{}, new double[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), new Object[]{null, new double[]{}}),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), new Object[]{null, new double[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{0.0}, new double[]{}}),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{0.0}, new double[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{1.0}, new double[]{1.0}}),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{1.0}, new double[]{1.0}})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{1.0}, new double[]{-1.0, 0.0, 1.0}}),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{1.0}, new double[]{-1.0, 0.0, 1.0}})
        );
    }
}
