package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3733NoDifferenceTest {

    private final ClonePair3733 subject = new ClonePair3733();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (int[]) values[1]), new Object[]{new double[]{}, new int[]{}}),
            capture(values -> subject.method2((double[]) values[0], (int[]) values[1]), new Object[]{new double[]{}, new int[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((double[]) values[0], (int[]) values[1]), new Object[]{new double[]{}, null}),
            capture(values -> subject.method2((double[]) values[0], (int[]) values[1]), new Object[]{new double[]{}, null})
        );
    }
}
