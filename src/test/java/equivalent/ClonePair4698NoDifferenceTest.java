package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4698NoDifferenceTest {

    private final ClonePair4698 subject = new ClonePair4698();

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
            capture(values -> subject.method1((double[]) values[0]), new Object[]{new double[]{1.0, 2.0}}),
            capture(values -> subject.method2((double[]) values[0]), new Object[]{new double[]{1.0, 2.0}})
        );
    }
}
