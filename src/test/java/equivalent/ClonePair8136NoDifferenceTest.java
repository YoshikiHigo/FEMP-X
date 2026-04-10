package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair8136NoDifferenceTest {

    private final ClonePair8136 subject = new ClonePair8136();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{new long[]{}};
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0]), caseInputs0),
            capture(values -> subject.method2((long[]) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0]), caseInputs1),
            capture(values -> subject.method2((long[]) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{new long[]{0L}};
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0]), caseInputs2),
            capture(values -> subject.method2((long[]) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{new long[]{1L, 2L}};
        assertEquivalent(
            capture(values -> subject.method1((long[]) values[0]), caseInputs3),
            capture(values -> subject.method2((long[]) values[0]), caseInputs3)
        );
    }
}
