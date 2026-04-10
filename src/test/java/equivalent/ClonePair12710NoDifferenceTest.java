package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12710NoDifferenceTest {

    private final ClonePair12710 subject = new ClonePair12710();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new double[]{}, new double[]{}};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), caseInputs0),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new double[]{}};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), caseInputs1),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new double[]{1.0, 2.0}, new double[]{1.0, 2.0}};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), caseInputs2),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new double[]{1.0, 2.0}, new double[]{-1.0, 0.0, 1.0}};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), caseInputs3),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new double[]{-1.0, 0.0, 1.0}, new double[]{1.0, 2.0}};
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1]), caseInputs4),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1]), caseInputs4)
        );
    }
}
