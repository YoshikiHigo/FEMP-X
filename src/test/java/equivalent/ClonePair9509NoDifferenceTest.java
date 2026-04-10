package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9509NoDifferenceTest {

    private final ClonePair9509 subject = new ClonePair9509();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0]), caseInputs0),
            capture(values -> subject.method2((int[]) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0]), caseInputs1),
            capture(values -> subject.method2((int[]) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new int[]{0}};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0]), caseInputs2),
            capture(values -> subject.method2((int[]) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new int[]{1}};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0]), caseInputs3),
            capture(values -> subject.method2((int[]) values[0]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new int[]{1, 2}};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0]), caseInputs4),
            capture(values -> subject.method2((int[]) values[0]), caseInputs4)
        );
    }
}
