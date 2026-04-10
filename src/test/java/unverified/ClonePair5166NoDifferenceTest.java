package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair5166NoDifferenceTest {

    private final ClonePair5166 subject = new ClonePair5166();

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
    }
}
