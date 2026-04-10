package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8773NoDifferenceTest {

    private final ClonePair8773 subject = new ClonePair8773();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new int[]{}, new int[]{}, 1, -1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs0),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new int[]{}, null, 1, -1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs1),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new int[]{}, new int[]{}, -1, -1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs2),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new int[]{0}, new int[]{0}, 1, -1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs3),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{new int[]{}, new int[]{}, -1, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs4),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs4)
        );
    }
}
