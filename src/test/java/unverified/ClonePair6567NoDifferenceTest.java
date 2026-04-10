package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair6567NoDifferenceTest {

    private final ClonePair6567 subject = new ClonePair6567();

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
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1]), new Object[]{new float[]{0.0f}, new float[]{}}),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1]), new Object[]{new float[]{0.0f}, new float[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1]), new Object[]{new float[]{0.0f}, new float[]{Float.NaN}}),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1]), new Object[]{new float[]{0.0f}, new float[]{Float.NaN}})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1]), new Object[]{new float[]{1.0f}, new float[]{1.0f}}),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1]), new Object[]{new float[]{1.0f}, new float[]{1.0f}})
        );
    }
}
