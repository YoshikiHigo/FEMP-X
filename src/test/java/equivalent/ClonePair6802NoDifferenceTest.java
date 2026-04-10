package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6802NoDifferenceTest {

    private final ClonePair6802 subject = new ClonePair6802();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new int[]{}, new int[]{}, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), caseInputs0),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new int[]{}, null, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), caseInputs1),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new int[]{0}, new int[]{0}, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), caseInputs2),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue()), caseInputs2)
        );
    }
}
