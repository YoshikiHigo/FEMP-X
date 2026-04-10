package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair11208NoDifferenceTest {

    private final ClonePair11208 subject = new ClonePair11208();

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
    }
}
