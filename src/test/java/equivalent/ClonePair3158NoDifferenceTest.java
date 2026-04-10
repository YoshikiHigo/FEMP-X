package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3158NoDifferenceTest {

    private final ClonePair3158 subject = new ClonePair3158();

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
