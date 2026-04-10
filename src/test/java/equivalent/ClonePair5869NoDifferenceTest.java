package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair5869NoDifferenceTest {

    private final ClonePair5869 subject = new ClonePair5869();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Double) values[1]).doubleValue()), new Object[]{new double[]{}, -1.0}),
            capture(values -> subject.method2((double[]) values[0], ((Double) values[1]).doubleValue()), new Object[]{new double[]{}, -1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Double) values[1]).doubleValue()), new Object[]{null, -1.0}),
            capture(values -> subject.method2((double[]) values[0], ((Double) values[1]).doubleValue()), new Object[]{null, -1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Double) values[1]).doubleValue()), new Object[]{new double[]{1.0}, -1.0}),
            capture(values -> subject.method2((double[]) values[0], ((Double) values[1]).doubleValue()), new Object[]{new double[]{1.0}, -1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Double) values[1]).doubleValue()), new Object[]{new double[]{-1.0, 0.0, 1.0}, -1.0}),
            capture(values -> subject.method2((double[]) values[0], ((Double) values[1]).doubleValue()), new Object[]{new double[]{-1.0, 0.0, 1.0}, -1.0})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], ((Double) values[1]).doubleValue()), new Object[]{new double[]{1.0, 2.0}, 0.5}),
            capture(values -> subject.method2((double[]) values[0], ((Double) values[1]).doubleValue()), new Object[]{new double[]{1.0, 2.0}, 0.5})
        );
    }
}
