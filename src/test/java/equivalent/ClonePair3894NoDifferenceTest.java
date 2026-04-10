package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3894NoDifferenceTest {

    private final ClonePair3894 subject = new ClonePair3894();

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
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{0.0}, new double[]{0.0}}),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), new Object[]{new double[]{0.0}, new double[]{0.0}})
        );
    }
}
