package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair11284NoDifferenceTest {

    private final ClonePair11284 subject = new ClonePair11284();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new int[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), caseInputs0),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), caseInputs1),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new int[]{0}, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), caseInputs2),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new int[]{1}, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), caseInputs3),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new int[]{-1, 0, 1}, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], ((Integer) values[1]).intValue()), caseInputs4),
            capture(values -> subject.method2((int[]) values[0], ((Integer) values[1]).intValue()), caseInputs4)
        );
    }
}
