package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6224NoDifferenceTest {

    private final ClonePair6224 subject = new ClonePair6224();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new boolean[]{}, new boolean[]{}};
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1]), caseInputs0),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, new boolean[]{}};
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1]), caseInputs1),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new boolean[]{true}, new boolean[]{}};
        assertEquivalent(
            capture(values -> subject.method1((boolean[]) values[0], (boolean[]) values[1]), caseInputs2),
            capture(values -> subject.method2((boolean[]) values[0], (boolean[]) values[1]), caseInputs2)
        );
    }
}
