package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair4257NoDifferenceTest {

    private final ClonePair4257 subject = new ClonePair4257();

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
