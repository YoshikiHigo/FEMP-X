package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8778NoDifferenceTest {

    private final ClonePair8778 subject = new ClonePair8778();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new int[]{}, new int[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs0),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new int[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs1),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new int[]{0}, new int[]{}, 1, 1};
        assertEquivalent(
            capture(values -> subject.method1((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs2),
            capture(values -> subject.method2((int[]) values[0], (int[]) values[1], ((Integer) values[2]).intValue(), ((Integer) values[3]).intValue()), caseInputs2)
        );
    }
}
