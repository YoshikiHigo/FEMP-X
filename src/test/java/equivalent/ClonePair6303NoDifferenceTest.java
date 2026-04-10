package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6303NoDifferenceTest {

    private final ClonePair6303 subject = new ClonePair6303();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new int[]{}, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), caseInputs0),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), caseInputs1),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new int[]{0}, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), caseInputs2),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new int[]{0}, new int[]{1}};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1]), caseInputs3),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1]), caseInputs3)
        );
    }
}
