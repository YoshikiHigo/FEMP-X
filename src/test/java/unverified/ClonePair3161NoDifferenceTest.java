package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3161NoDifferenceTest {

    private final ClonePair3161 subject = new ClonePair3161();

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
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0]), new Object[]{new float[]{0.0f}}),
            capture(values -> subject.method2((float[]) values[0]), new Object[]{new float[]{0.0f}})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0]), new Object[]{new float[]{1.0f}}),
            capture(values -> subject.method2((float[]) values[0]), new Object[]{new float[]{1.0f}})
        );
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0]), new Object[]{new float[]{Float.NaN}}),
            capture(values -> subject.method2((float[]) values[0]), new Object[]{new float[]{Float.NaN}})
        );
    }
}
