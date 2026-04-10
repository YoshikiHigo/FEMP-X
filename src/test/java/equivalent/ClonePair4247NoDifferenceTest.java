package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair4247NoDifferenceTest {

    private final ClonePair4247 subject = new ClonePair4247();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1]), new Object[]{new float[]{}, new float[]{}}),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1]), new Object[]{new float[]{}, new float[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1]), new Object[]{null, new float[]{}}),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1]), new Object[]{null, new float[]{}})
        );
    }
}
