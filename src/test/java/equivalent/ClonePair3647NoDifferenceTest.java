package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3647NoDifferenceTest {

    private final ClonePair3647 subject = new ClonePair3647();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0]), new Object[]{new float[]{}}),
            capture(values -> subject.method2((float[]) values[0]), new Object[]{new float[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0]), new Object[]{null}),
            capture(values -> subject.method2((float[]) values[0]), new Object[]{null})
        );
    }
}
