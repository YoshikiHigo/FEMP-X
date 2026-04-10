package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6571NoDifferenceTest {

    private final ClonePair6571 subject = new ClonePair6571();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new float[]{}, new float[]{}};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1]), caseInputs0),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new float[]{}};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1]), caseInputs1),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new float[]{0.0f}, new float[]{}};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1]), caseInputs2),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new float[]{0.0f}, new float[]{Float.NaN}};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1]), caseInputs3),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new float[]{1.0f}, new float[]{1.0f}};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0], (float[]) values[1]), caseInputs4),
            capture(values -> subject.method2((float[]) values[0], (float[]) values[1]), caseInputs4)
        );
    }
}
