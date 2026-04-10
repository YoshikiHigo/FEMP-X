package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3746NoDifferenceTest {

    private final ClonePair3746 subject = new ClonePair3746();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue()), new Object[]{new double[]{}, new double[]{}, 0.5}),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue()), new Object[]{new double[]{}, new double[]{}, 0.5})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue()), new Object[]{null, new double[]{}, 0.5}),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue()), new Object[]{null, new double[]{}, 0.5})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue()), new Object[]{new double[]{0.0}, new double[]{}, 0.5}),
            capture(values -> subject.method2((double[]) values[0], (double[]) values[1], ((Double) values[2]).doubleValue()), new Object[]{new double[]{0.0}, new double[]{}, 0.5})
        );
    }
}
