package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair9498NoDifferenceTest {

    private final ClonePair9498 subject = new ClonePair9498();

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
    }
}
