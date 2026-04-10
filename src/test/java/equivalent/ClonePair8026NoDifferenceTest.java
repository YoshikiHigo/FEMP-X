package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8026NoDifferenceTest {

    private final ClonePair8026 subject = new ClonePair8026();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new Object[]{}, new Object[]{}, new int[]{}};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1], (int[]) values[2]), caseInputs0),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1], (int[]) values[2]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new Object[]{}, new Object[]{}, null};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1], (int[]) values[2]), caseInputs1),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1], (int[]) values[2]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new Object[]{}, new Object[]{}, new int[]{0}};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1], (int[]) values[2]), caseInputs2),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1], (int[]) values[2]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new Object[]{"a"}, new Object[]{null}, new int[]{0}};
        assertEquivalent(
            capture(values -> subject.method1((Object[]) values[0], (Object[]) values[1], (int[]) values[2]), caseInputs3),
            capture(values -> subject.method2((Object[]) values[0], (Object[]) values[1], (int[]) values[2]), caseInputs3)
        );
    }
}
