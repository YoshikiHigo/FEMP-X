package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair6718NoDifferenceTest {

    private final ClonePair6718 subject = new ClonePair6718();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new byte[]{}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), caseInputs0),
            capture(values -> subject.method2((byte[]) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), caseInputs1),
            capture(values -> subject.method2((byte[]) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new byte[]{0, 1, 2, 3, 4, 5, 6, 7}};
        assertEquivalent(
            capture(values -> subject.method1((byte[]) values[0]), caseInputs2),
            capture(values -> subject.method2((byte[]) values[0]), caseInputs2)
        );
    }
}
