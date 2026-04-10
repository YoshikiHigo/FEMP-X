package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8917NoDifferenceTest {

    private final ClonePair8917 subject = new ClonePair8917();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new float[]{}};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0]), caseInputs0),
            capture(values -> subject.method2((float[]) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0]), caseInputs1),
            capture(values -> subject.method2((float[]) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new float[]{0.0f}};
        assertEquivalent(
            capture(values -> subject.method1((float[]) values[0]), caseInputs2),
            capture(values -> subject.method2((float[]) values[0]), caseInputs2)
        );
    }
}
