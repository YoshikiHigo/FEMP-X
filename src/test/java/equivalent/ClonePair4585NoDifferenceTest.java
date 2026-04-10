package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4585NoDifferenceTest {

    private final ClonePair4585 subject = new ClonePair4585();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0]), new Object[]{new double[]{}}),
            capture(values -> subject.method2((double[]) values[0]), new Object[]{new double[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0]), new Object[]{null}),
            capture(values -> subject.method2((double[]) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0]), new Object[]{new double[]{0.0}}),
            capture(values -> subject.method2((double[]) values[0]), new Object[]{new double[]{0.0}})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0]), new Object[]{new double[]{1.0}}),
            capture(values -> subject.method2((double[]) values[0]), new Object[]{new double[]{1.0}})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0]), new Object[]{new double[]{-1.0, 0.0, 1.0}}),
            capture(values -> subject.method2((double[]) values[0]), new Object[]{new double[]{-1.0, 0.0, 1.0}})
        );
    }
}
